package com.example.jdbcdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbcdemo.model.Order;
import com.example.jdbcdemo.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void create(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	@Override
	public Order getById(Long id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

}
