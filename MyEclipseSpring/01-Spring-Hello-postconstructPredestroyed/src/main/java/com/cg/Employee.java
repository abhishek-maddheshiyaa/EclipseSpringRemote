package com.cg;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Employee {
	private int id;
	private String Name;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + "]";
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Bean is created");
	}
	public void destroy()
	{
		System.out.println("Bean is destroyed");
	}
}
