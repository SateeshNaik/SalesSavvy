package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItems, Integer> {

    @Query("select oi from OrderItems oi where oi.order.orderId = :orderId")
    List<OrderItems> findByOrderId(String orderId);

    @Query("select oi from OrderItems oi where oi.order.userId = :userId and oi.order.status = 'SUCCESS'")
    List<OrderItems> findSuccessfulOrderItemsByUserId(int userId);
}
