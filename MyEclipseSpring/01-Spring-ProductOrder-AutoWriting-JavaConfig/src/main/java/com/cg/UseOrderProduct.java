package com.cg;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UseOrderProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Order ord = ctx.getBean("order", Order.class);
		System.out.println(ord);

	}

}
