package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Testemp {

	public static void testempname()
	{
		
		Employee firstEmployee=new Employee(68687);
		firstEmployee.setName("JERUSHA");
		System.out.println(firstEmployee.getName());
		
	}
	
	public static void testCity()
{
		
		Employee firstEmployee=new Employee(68687);
		firstEmployee.setCity("madurai");
		System.out.println(firstEmployee.getCity());
		
	}
	public static void testSalary() {
		Employee firstEmployee=new Employee(68687);
		firstEmployee.setSalary(76548);
		System.out.println(firstEmployee.getSalary());
		
	}
	
}
