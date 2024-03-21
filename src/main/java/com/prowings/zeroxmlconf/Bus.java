package com.prowings.zeroxmlconf;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {
	
	private int id;
	private String company;
	private String type;
	@Autowired
	private Engine engine;

	public static int counter;
	
	public Bus() {
		System.out.println("bus no arg constructor executed!!");
		counter++;
	}

	public void myInit()
	{
		System.out.println("inside myInit() method!!");
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", company=" + company + ", type=" + type + ", engine=" + engine + "]";
	}

}
