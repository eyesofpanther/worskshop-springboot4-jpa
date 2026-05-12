package com.alcateia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcateia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
