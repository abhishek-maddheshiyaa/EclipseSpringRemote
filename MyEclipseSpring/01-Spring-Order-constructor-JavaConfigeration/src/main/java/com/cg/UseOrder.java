package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Employee emp = (Employee) ctx.getBean("empean");
		
		Order o = ctx.getBean("ordBean", Order.class);
		System.out.println(o);
	
	}

}
