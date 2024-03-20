package com.prowings.beans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotaionConfig {
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
	
//		Employee emp2 = ctx.getBean("employee", Employee.class);
//		System.out.println(emp2);

		Employee emp = ctx.getBean("emp2", Employee.class);
		System.out.println(emp);

		Employee emp1 = ctx.getBean("emp1", Employee.class);
		System.out.println(emp1);

		
		System.out.println("total beans in container :"+ctx.getBeanDefinitionCount());
		
		System.out.println("Names : "+Arrays.toString(ctx.getBeanDefinitionNames()));
		
		
		A2 b = ctx.getBean("a2", A2.class);
		System.out.println(b);
		A a = ctx.getBean("a", A.class);
		System.out.println(a);
		
		
		Student s = ctx.getBean("student", Student.class);
		
		System.out.println(s);
	}

}
