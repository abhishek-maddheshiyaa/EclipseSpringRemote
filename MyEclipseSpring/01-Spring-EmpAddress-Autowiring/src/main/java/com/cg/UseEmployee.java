package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApllicationContext.xml");
		
//		Address address1 = context.getBean("address",Address.class);
		//System.out.println(address1);
		Employee emp = ctx.getBean("empbean",Employee.class);
		System.out.println(emp);
	}

}
