package com.prowings.zeroxmlconf;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = "prototype")
public class Bike {
	@Value(value = "99")
	private int id;
	@Value(value = "BMW")
	private String name;
	@Value(value = "SportsBike")
	private String type;

	public Bike() {
	}

	@PostConstruct
	public void myBikeInit()
	{
		System.out.println("inside bike-init method!!");
	}

	@PreDestroy
	public void myBikeDestroy()
	{
		System.out.println("inside bike-destroy method!!");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	

}
