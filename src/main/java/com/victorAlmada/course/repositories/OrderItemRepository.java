package com.victorAlmada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorAlmada.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
