package com.alcateia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcateia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
