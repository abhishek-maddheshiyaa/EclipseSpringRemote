package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Product product()
	{
		Product product = new Product();
		product.setProdName("Hot wheel");
		product.setPrice("150");
		
		return product;
	}
	@Bean
	public Order order()
	{
		Order order = new Order();
			order.setOrderDate("10/10/2024");
			order.setOrderId(1);
			order.setQuantity(2);
			
		return order;
	}
}
