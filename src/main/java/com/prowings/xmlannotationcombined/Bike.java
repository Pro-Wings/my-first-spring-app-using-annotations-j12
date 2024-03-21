package com.prowings.xmlannotationcombined;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value(value = "10")
	private int id;
	@Value(value = "Splendor")
	private String name;
	@Value(value = "MotorPowered")
	private String type;

	public Bike() {
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
