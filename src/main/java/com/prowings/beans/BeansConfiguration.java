package com.prowings.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.prowings")
public class BeansConfiguration {
	
	@Bean(name = {"emp1"})
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Ram");
		emp.setAddress("Pune");
		
		return emp;
	}

	@Bean(name = {"emp2"})
	public Employee getEmployee1()
	{
		Employee emp = new Employee();
		emp.setId(20);
		emp.setName("Sham");
		emp.setAddress("Mumbai");
		
		return emp;
	}
	
	@Bean(name = {"addr1"})
	public Address getAddress()
	{
		return new Address(123, "Pune");
	}

	@Bean(name = {"address"})
//	@Primary
	public Address getAddress1()
	{
		return new Address(345, "Mumbai");
	}

}
