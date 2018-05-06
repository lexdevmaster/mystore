package com.example.mystore.view;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonView;

public class ProductDetailView extends ProductView{

	public ProductDetailView(BigInteger id, String name) {
		super(id, name);
	}

	public ProductDetailView(BigInteger id, String name, Timestamp date) {
		super(id, name);
		setDate(date);
	}

	public ProductDetailView() {

	}

	@JsonView
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");
	    String strDate = sdf.format(date);
	    
		this.date = strDate;
	}
	
}
