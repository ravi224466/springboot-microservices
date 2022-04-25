package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

	long id;
	String name;
	BigDecimal price;
	Date mdate;
	Date edate;	
	
	public Product() {
		super();
	}
		
	public Product(long id, String name, BigDecimal price, Date mdate, Date edate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mdate = mdate;
		this.edate = edate;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	
	
	
}
