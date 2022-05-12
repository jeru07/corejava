package com.chainsys.classandmethods;

public class Car {

	private final String regNo;
	private int yearOfPurchase;
	private String color;
	private String fuel;
	
	public Car(String rno)
	{
		this.regNo=rno;
	}

	public String getRegNo() {
		return regNo;
	}

	public int getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
	public class ABC
	{
		private final int branchid;
		public ABC(int bid)
		{
			this.branchid=bid;
		
		}
		public int getBranchid() {
			return branchid;
		}
		public class Employe
		{
			private final int empID;
			private String empname;
			private String empaddress;
			private String empmail;
			private  long empphone;
			
			public Employe(int eid)
			{
				this.empID=eid;
			}
			public class Customer
			{
				private String cusname;
				private long cusaccno;
				private String cusaddress;
				private String cusmail;
				private  long cusphone;
				
			}
		public class Service
		{
			private int savingsacc;
			private int currentacc;
		}
		}
		
		
		
		
		
		
		
	}
	
	
}