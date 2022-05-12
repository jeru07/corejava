package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	
	public static void testCar()
	{
		Car firstCar=new Car("TN 59 7777");
		firstCar.setColor("red");
		firstCar.setFuel("petrol");
		firstCar.setYearOfPurchase(2021);
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getYearOfPurchase());
	}
	
	

}
