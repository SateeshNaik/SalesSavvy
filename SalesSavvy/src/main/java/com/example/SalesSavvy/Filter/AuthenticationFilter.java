package com.example.SalesSavvy.Filter;


import com.example.SalesSavvy.Entities.Role;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.UserRepository;
import com.example.SalesSavvy.Service.AuthService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

//@WebFilter(urlPatterns = {"/api/*","/admin/*"})
@Component
public class AuthenticationFilter implements  Filter{
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);
    private final AuthService authService;
    private final UserRepository userRepository;

    private static final String ALLOWED_ORGIN="http://localhost:5174";

    private static final String[] UNAUTHENTICATED_PATHS={"/api/users/register","/api/auth/login"};

    public AuthenticationFilter(AuthService authService,UserRepository userRepository){
        System.out.println("Filter Started");
        this.authService=authService;
        this.userRepository=userRepository;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException,ServletException {
        try {
            excuteFilterLogic(request,response,chain);
        } catch (Exception e){
            logger.error("Unexpected error in AuthenticatedFilter",e);
            sendErrorResponse((HttpServletResponse) response,HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"internal server error");
        }
    }

    private void excuteFilterLogic(ServletRequest request,ServletResponse response,FilterChain chain)
        throws IOException, ServletException{
        HttpServletRequest httpRequest=(HttpServletRequest) request;
        HttpServletResponse httpResponse= (HttpServletResponse) response;

        String requestURI = httpRequest.getRequestURI().trim();
        logger.info("Request URI:{}",requestURI);

        //Allow unauthenticated paths
        if(Arrays.asList(UNAUTHENTICATED_PATHS).contains(requestURI)){
            chain.doFilter(request,response);
            return;
        }

        //Handle preflight(OPTIONS) requests
        if(httpRequest.getMethod().equalsIgnoreCase("OPTIONS")){
            setCORSHeaders(httpResponse);
            return;
        }

        //Extract and validate the token
        String token=getAuthTokenFromCookies(httpRequest);
        System.out.println(token);
        if(token==null || !authService.validateToken(token)){
            sendErrorResponse(httpResponse,HttpServletResponse.SC_UNAUTHORIZED,"Unauthorized: invalid or missing token");
            return;
        }

        //Extract username and verify user
        String username=authService.extractUsername(token);
        Optional<User> userOptional = userRepository.findByUsername(username);
        if(userOptional.isEmpty()){
            sendErrorResponse(httpResponse,HttpServletResponse.SC_UNAUTHORIZED,"Unauthorized: User not found");
            return;
        }

        //Get authenticated user and role
        User authenticatedUser =userOptional.get();
        Role role=authenticatedUser.getRole();
        logger.info("Authenticated User: {} with role {}",
                authenticatedUser.getUsername(), role);



        //Role-based access control
        if(requestURI.startsWith("/admin") && role !=Role.ADMIN){
            sendErrorResponse(httpResponse,HttpServletResponse.SC_FORBIDDEN,"Forbidden: Admin access required");
            return;
        }

        //Attach user details to request
        httpRequest.setAttribute("authenticatedUser", authenticatedUser);
        chain.doFilter(request, response);

    }
    private void setCORSHeaders(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", ALLOWED_ORGIN);
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setStatus(HttpServletResponse.SC_OK);
    }

    private void sendErrorResponse(HttpServletResponse response,int statusCode,String message) throws IOException {
        response.setStatus(statusCode);
        response.getWriter().write(message);
    }

    private String getAuthTokenFromCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if ("authToken".equals(cookie.getName())) {
                return cookie.getValue();
            }
        }
        System.out.println("Cookies: " + Arrays.toString(request.getCookies()));
        return null;
    }

}
