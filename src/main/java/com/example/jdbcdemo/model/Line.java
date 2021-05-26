package com.example.jdbcdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lines")
public class Line {
	
	public Line() {
		
	}
	
	public Line(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	private Long id;
	private String name;
}
