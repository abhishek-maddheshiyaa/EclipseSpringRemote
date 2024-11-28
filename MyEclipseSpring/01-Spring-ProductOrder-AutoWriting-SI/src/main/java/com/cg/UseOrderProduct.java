package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseOrderProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApllicationContext.xml");
		
//		Product p = ctx.getBean("prodBean" , Product.class);
		Order o = ctx.getBean("ordBean", Order.class);
		System.out.println(o);
	}

}
