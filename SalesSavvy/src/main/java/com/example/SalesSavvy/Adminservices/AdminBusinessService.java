package com.example.SalesSavvy.Adminservices;

import com.example.SalesSavvy.Entities.Order;
import com.example.SalesSavvy.Entities.OrderItems;
import com.example.SalesSavvy.Entities.OrderStatus;
import com.example.SalesSavvy.Repositories.OrderItemRepository;
import com.example.SalesSavvy.Repositories.OrderRepository;
import com.example.SalesSavvy.Repositories.ProductRepository;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import org.aspectj.weaver.ast.Or;
import org.hibernate.dialect.OracleNestedTableJdbcType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class AdminBusinessService {

    private final OrderItemRepository orderItemRepository;
    private  final  ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public AdminBusinessService(OrderItemRepository orderItemRepository, ProductRepository productRepository, OrderRepository orderRepository) {
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Map<String, Object> calculateMonthlyBusiness(int month, int year){
        List<Order> successfulOrders=orderRepository.findSuccessfulOrdersByMonthAndYear(month,year);
        return calculateBusinessMetrics(successfulOrders);
    }

    public Map<String,Object> calculateDailyBusiness(LocalDate date){
        List<Order> successfulOrders=orderRepository.findSuccessfulOrdersByDate(date);
        return calculateBusinessMetrics(successfulOrders);
    }

    public Map<String,Object> calculateYearlyBusiness(int year){
        List<Order> successfulOrders=orderRepository.findSuccessfulOrdersByYear(year);
        return calculateBusinessMetrics(successfulOrders);
    }
    public Map<String,Object> calculateOverallBusiness(){
        List<Order> successfulOrders=orderRepository.findAllByStatusForOverallBusiness();
        return calculateBusinessMetrics(successfulOrders);
    }

    private Map<String,Object> calculateBusinessMetrics(List<Order> orders){
        double totalRevenue=0.0;
        Map<String,Integer> categorySales=new HashMap<>();
        for(Order order:orders){
            totalRevenue +=order.getTotalAmount().doubleValue();

            List<OrderItems> items= orderItemRepository.findByOrderId(order.getOrderId());
            for(OrderItems item:items){
                String categoryName=productRepository.findCategoryNameProductId(item.getProductId());
                categorySales.put(categoryName,categorySales.getOrDefault(categoryName,0)+ item.getQuantity());

            }
        }
        Map<String,Object> metrics=new HashMap<>();
        metrics.put("totalRevenue", totalRevenue);
        metrics.put("categorySales",categorySales);
        return metrics;
    }
}
