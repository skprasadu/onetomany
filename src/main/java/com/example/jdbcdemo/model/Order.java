package com.example.jdbcdemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {
	public Order() {

	}

	public Order(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	private Long id;
	private String name;

	//TODO: uncomment this to make 1 stretch test testUpdateProjectAndEmployees
	@OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Line> lines = new ArrayList<>();
}
