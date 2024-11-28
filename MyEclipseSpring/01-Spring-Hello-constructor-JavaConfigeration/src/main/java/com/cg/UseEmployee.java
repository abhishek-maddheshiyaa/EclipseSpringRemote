package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Employee emp = (Employee) ctx.getBean("empean");
		
		Employee emp = ctx.getBean("empBean", Employee.class);
		System.out.println(emp);
	
	}

}
