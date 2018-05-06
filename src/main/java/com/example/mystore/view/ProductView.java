package com.example.mystore.view;

import java.math.BigInteger;

import org.springframework.web.servlet.View;

import com.fasterxml.jackson.annotation.JsonView;

public class ProductView {
	@JsonView
	private BigInteger id;
	
	@JsonView
	private String name;

	public ProductView(BigInteger id, String name) {
		setId(id);
		setName(name);
	}

	public ProductView() {
		
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
