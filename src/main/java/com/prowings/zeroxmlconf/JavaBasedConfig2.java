package com.prowings.zeroxmlconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
public class JavaBasedConfig2 {
	
	@Bean("beanA")
//	@DependsOn("beanB")
	public A getA()
	{
		return new A();
	}

	@Bean("beanB")
	@Lazy
	public B getB()
	{
		return new B();
	}


}
