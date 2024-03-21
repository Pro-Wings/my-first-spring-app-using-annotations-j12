package com.prowings.xmlannotationcombined;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private int id;
	private String company;
	@Autowired
	private Engine engine;

	public Car() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", engine=" + engine + "]";
	}

}
