package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApllicationContext.xml");
		
//		Employee emp = (Employee) ctx.getBean("empbean");
		
		Employee emp = ctx.getBean("empbean", Employee.class);
		System.out.println(emp);
		
		Employee emp1 = ctx.getBean("empbean1", Employee.class);
		System.out.println(emp1);
	}

}
