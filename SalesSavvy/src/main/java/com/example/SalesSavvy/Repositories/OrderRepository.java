package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.Order;
import com.fasterxml.jackson.datatype.jsr310.deser.OffsetTimeDeserializer;
import org.aspectj.weaver.ast.Or;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {

    // 1. Find successful orders by month and year
    @Query("SELECT o FROM Order o WHERE MONTH(o.createdAt) = :month AND YEAR(o.createdAt) = :year AND o.status = 'SUCCESS'")
    List<Order> findSuccessfulOrdersByMonthAndYear(int month, int year);


    // 2. Find successful orders by exact date
    @Query("SELECT o FROM Order o WHERE DATE(o.createdAt) = :date AND o.status = 'SUCCESS'")
    List<Order> findSuccessfulOrdersByDate(LocalDate date);


    // 3. Find successful orders by year
    @Query("SELECT o FROM Order o WHERE YEAR(o.createdAt) = :year AND o.status = 'SUCCESS'")
    List<Order> findSuccessfulOrdersByYear(int year);


    // 4. Calculate overall business (sum of totalAmount for successful orders)
    @Query("SELECT COALESCE(SUM(o.totalAmount), 0) FROM Order o WHERE o.status = 'SUCCESS'")
    BigDecimal calculateOverallBusiness();


    // 5. Find all orders by status
    @Query("SELECT o FROM Order o WHERE o.status = :status")
    List<Order> findAllByStatus(String status);

    @Query("SELECT o FROM Order o WHERE o.status = 'SUCCESS'")
    List<Order> findAllByStatusForOverallBusiness();



}
