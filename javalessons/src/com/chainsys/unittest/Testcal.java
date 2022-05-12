package com.chainsys.unittest;

import javax.naming.spi.DirStateFactory.Result;

import com.chainsys.variables.Calculator;

public class Testcal {

	public static void add()
	{
		System.out.println("result is " +Calculator.add(5, 4));
	}
	public static void subtract()
	{
		System.out.println("reult is "+Calculator.subtract(10, 6));
	}
	public static void multiply()
	{
		System.out.println("result is "+Calculator.multiply(10, 6));
	}
	public static void divide()
	{
		System.out.println("result is "+Calculator.divide(10, 2));
	}
	
	
}
