package com.chainsys.classandmethods;
/**
 * 
 * @author jeru3112
 *CREATED ON 25 march 2022
 */
public class Employee {
	
	private final int empID;
	private String name;
	private String city;
	private  long salary;
	
	//constructor
	public Employee(int id)
	{
		//assign value to field
		this.empID=id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public int getEmpID()
	{
		return empID;
	}
	public String getCity()
	{
	return city;	
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public long getSalary() {
		return salary;
		
	}
	public void setSalary(long salary)
	{
		this.salary=salary;
	}
}

