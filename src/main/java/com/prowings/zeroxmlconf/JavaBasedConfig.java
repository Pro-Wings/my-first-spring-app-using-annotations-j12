package com.prowings.zeroxmlconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.prowings.zeroxmlconf")
public class JavaBasedConfig {
	
//	@Bean(name = "bike2")
//	public Bike getBike()
//	{
//		Bike bike = new Bike();
//		bike.setId(555);
//		bike.setName("TVS");
//		bike.setType("RegularBike");
//		return bike;
//	}
	
	@Bean(name="aaa",initMethod = "myInit")
	@Scope("prototype")
	public Bus getBus()
	{
		Bus b = new Bus();
		b.setId(333);
		b.setCompany("TATA-NEW");
		b.setType("Traveller");
		return b;
	}


	@Bean
	public Engine getEngine()
	{
		Engine e = new Engine();
		e.setId(777);
		e.setName("V12");
		return e;
	}
	
}
