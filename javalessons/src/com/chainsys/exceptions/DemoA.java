package com.chainsys.exceptions;

import java.util.Scanner;

public class DemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		m4();
	}

	public static void m4()

{
		System.out.println("before try");
		int x=0,y=0,z=0;
		String s1=null,s2=null;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("inside try");
			System.out.println("enter value for x");
			s1=sc.nextLine();
			System.out.println("enter value for y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("resul"+z);
			
		}
		//catch(Exception err)
		//{
			//System.out.println("inside catch"+err.getMessage());
			//System.out.println("error type"+err.getClass().getName());
		//}
		catch(ArithmeticException err)
		{
			System.out.println("inside catch"+err.getMessage());
			System.out.println("error type"+err.getClass().getName());
		}
		catch(Exception err)
		{
			System.out.println("inside catch"+err.getMessage());
			System.out.println("error type"+err.getClass().getName());
		}
		finally
		{
			System.out.println("inside finally");
			
		}
		}
}
