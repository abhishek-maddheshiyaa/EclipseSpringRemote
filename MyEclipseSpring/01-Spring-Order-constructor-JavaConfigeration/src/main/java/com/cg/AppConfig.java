package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean  //this is used to declare a method producing a bean.
	public Order ordBean()
	{
		return new Order(1,"09/09/2009","Bella");
	}
}
