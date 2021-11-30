package com.victorAlmada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorAlmada.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
