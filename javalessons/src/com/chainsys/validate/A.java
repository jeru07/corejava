package com.chainsys.validate;

import java.util.Scanner;

public class A {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		 if((!name.equals(null))&&name.matches("^[a-zA-Z]*$"))
	         System.out.println(" string is a proper name.");
	      else
	         System.out.println("enter valid name");
	}

}
