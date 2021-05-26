package com.example.jdbcdemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jdbcdemo.model.Line;
import com.example.jdbcdemo.model.Order;

@SpringBootTest
public class OrderLineServiceImplTest {
	
	@Autowired
	OrderService service;
	
	@Test
	public void testUpdateProjectAndEmployees() {
		
		Order p = new Order(4l, "nv1");
		
		Line e = new Line(1l, "kp");
		
		p.getLines().add(e);
		
		service.create(p);
		
		Order p1 = service.getById(4l);
		
		p1.setName("nv2");

		p1.getLines().get(0).setName("kp1");
		
		service.update(p1);
		
		Order p2 = service.getById(4l);
		assertEquals("nv2", p2.getName());

		assertEquals("kp1", p2.getLines().get(0).getName());
	}

}
