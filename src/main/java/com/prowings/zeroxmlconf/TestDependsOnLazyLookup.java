package com.prowings.zeroxmlconf;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestDependsOnLazyLookup {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
		A a = context.getBean("beanA", A.class);
		System.out.println(a);
		B b = context.getBean("beanB", B.class);
		System.out.println(b);
		
//		-------- @Lazy--------
		
		P p = context.getBean("p", P.class);
		Q q = context.getBean("q", Q.class);
		
		System.out.println(p);
		System.out.println(q);
//		-------- @Lazy--------
		
		SingltonBean bean = context.getBean(SingltonBean.class);
		bean.usePrototype();

		SingltonBean bean2 = context.getBean(SingltonBean.class);
		bean2.usePrototype();

	
	}

	
}
