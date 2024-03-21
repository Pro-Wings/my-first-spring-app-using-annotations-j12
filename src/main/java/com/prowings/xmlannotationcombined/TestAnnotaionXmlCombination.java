package com.prowings.xmlannotationcombined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotaionXmlCombination {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		Car car = context.getBean("car1", Car.class);
		System.out.println(car);
		
		Bike bike = context.getBean("bike", Bike.class);
		System.out.println(bike);
		
		Bus bus = context.getBean("bus1", Bus.class);
		System.out.println(bus);

		Bus bus1 = context.getBean("bus2", Bus.class);
		System.out.println(bus1);
		
		
	}

}
