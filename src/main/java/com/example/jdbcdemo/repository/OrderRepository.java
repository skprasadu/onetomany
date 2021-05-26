package com.example.jdbcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jdbcdemo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
