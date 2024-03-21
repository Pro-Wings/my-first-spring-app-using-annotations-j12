package com.prowings.zeroxmlconf;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestZeroXmlConf {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
		Bike bike = context.getBean("bike", Bike.class);
		System.out.println(bike);

		Bike bike3 = context.getBean("bike", Bike.class);
		System.out.println(bike);

		System.out.println("Ref equality of bike : "+ (bike==bike3));
		
//		Bike bike2 = context.getBean("bike2", Bike.class);
//		System.out.println(bike2);
		
		Bus bus1 = context.getBean(Bus.class);
		System.out.println(bus1);

		Bus bus2 = context.getBean(Bus.class);
		System.out.println(bus2);
		
		System.out.println(bus1==bus2);
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println("Bus Beans counter :"+Bus.counter);
		
		context.registerShutdownHook();
	}

	
}
