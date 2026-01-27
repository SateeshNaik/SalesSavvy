package com.example.SalesSavvy.ServiceImpIemetations;

import com.example.SalesSavvy.Entities.JWTToken;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.JWTTokenRepository;
import com.example.SalesSavvy.Repositories.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import static io.jsonwebtoken.Jwts.*;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JWTTokenRepository jwtTokenRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final Key SIGNIN_KEY;

    @Autowired
    public AuthService(UserRepository userRepository, JWTTokenRepository jwtTokenRepository, @Value("${jwt.secret}") String jwtSecret) {
        this.userRepository = userRepository;
        this.jwtTokenRepository = jwtTokenRepository;
        this.passwordEncoder=new BCryptPasswordEncoder();

        if (jwtSecret.getBytes(StandardCharsets.UTF_8).length<64){
            throw new IllegalArgumentException("JWT_SECRET in application.properties must be at least 64 bytes long for HS512.");
        }
        this.SIGNIN_KEY=Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8));;
    }

    //LOGIN CHECK
    public User authenticate(String username, String password) {

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Invalid username or password"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }

        return user;
    }

    //TOKEN HANDLING
    public String generateToken(User user) {

        Optional<JWTToken> existingToken =
                Optional.ofNullable(jwtTokenRepository.findByUser_UserId(user.getUserId()));

        if (existingToken.isPresent()
                && LocalDateTime.now().isBefore(existingToken.get().getExpiresAt())) {
            return existingToken.get().getToken();
        }

        existingToken.ifPresent(jwtTokenRepository::delete);

        String token = createJwt(user);
        saveToken(user, token);
        return token;
    }

    //JWT CREATION
    private String createJwt(User user) {
        return builder().subject(user.getUsername())
                .claim("role", user.getRole().name())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000)).signWith(SIGNIN_KEY)
                .compact();
    }
    //SAVE TOKEN IN DB
    private void saveToken(User user, String token) {

        JWTToken jwtToken = new JWTToken(
                token,
                user,
                LocalDateTime.now().plusHours(1)
        );
        jwtTokenRepository.save(jwtToken);
    }


    public boolean validateToken(String token){
        try {
            System.out.println("VALIDATING TOKEN.....");
            //parse and validate the token
            Jwts.parser()
                    .verifyWith((SecretKey) SIGNIN_KEY)
                    .build()
                    .parseSignedClaims(token);

           //Check if the token exists in the database and is not expired
            Optional<JWTToken> jwtToken=jwtTokenRepository.findByToken(token);
            if(jwtToken.isPresent()){
                System.err.println("token Expiry: " + jwtToken.get().getExpiresAt());
                System.err.println("Current Time: " + LocalDateTime.now());
                return jwtToken.get().getExpiresAt().isAfter(LocalDateTime.now());
            }
            return false;
        } catch (Exception e) {
            System.err.println("Token validation failed: " + e.getMessage());
            return false;
        }
    }

    public String extractUsername(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) SIGNIN_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

}
