package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean  //this is used to declare a method producing a bean.
	public Employee empBean()
	{
		return new Employee(1,"Clara");
	}
}
