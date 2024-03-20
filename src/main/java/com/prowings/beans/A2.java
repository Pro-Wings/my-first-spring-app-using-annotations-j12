package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A2 {

	@Value(value = "3000")
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int a) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A2 [b=" + b + "]";
	}
	
	
}
