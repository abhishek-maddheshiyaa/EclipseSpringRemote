package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApllicationContext.xml");
		
		
		Order emp = ctx.getBean("ordBean", Order.class);
		System.out.println(emp);
		
		Order emp1 = ctx.getBean("ordBean1", Order.class);
		System.out.println(emp1);
	}

}
