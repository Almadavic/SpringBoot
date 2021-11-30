package com.victorAlmada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorAlmada.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order,Long> {

	
}
