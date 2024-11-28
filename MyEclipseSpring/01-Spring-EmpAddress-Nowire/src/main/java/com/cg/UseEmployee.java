package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApllicationContext.xml");
		
		//Address address = context.getBean("add",Address.class);
		//System.out.println(address);
		Employee emp = context.getBean("empbean",Employee.class);
		System.out.println(emp);
	}

}
