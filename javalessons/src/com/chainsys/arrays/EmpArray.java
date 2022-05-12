package com.chainsys.arrays;

public class EmpArray {
	private static Employee empArray[];
	private static void createArray() {
		
	
	
		 empArray=new Employee[10];
		int index=0;
		for(index=0;index<10;index++)
		{
			Employee emp=new Employee(index);
			emp.setName("emp"+index);
			empArray[index]=emp;
		}
	}
	public static void display()
	{
		if(empArray==null)
		{
			System.out.println("employee is null");
			return;
		}
		System.out.println("no of employees"+empArray.length);
		for(Employee e1:empArray) {
			System.out.println("id="+e1.getId()+"name="+e1.getName());
		}
			
	}
}
