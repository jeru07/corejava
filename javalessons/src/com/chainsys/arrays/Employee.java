package com.chainsys.arrays;

public class Employee {
	
	
	private final long id;
	private String name;
	public Employee(long v1)
	{
		this.id=v1;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
