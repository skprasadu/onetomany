package com.example.jdbcdemo.service;

import com.example.jdbcdemo.model.Order;

public interface OrderService {

	void create(Order order);

	Order getById(Long id);

	void update(Order order);


}
