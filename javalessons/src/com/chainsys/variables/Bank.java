package com.chainsys.variables;

import java.util.Scanner;

public class Bank {

public static int totalamount;
public static int accNumber;
public static String customerName;

	public static void deposit(int amount)
	{
	    totalamount=totalamount+amount;
	     
		}
	public static int withdraw(int amount)
	{
	    totalamount=totalamount-amount;
	    
	     return amount;
		}
	
	public static void openAccount(String name,int accnumber)
	{
	       	customerName=name;
	       	accNumber=accnumber;
	       			
}
}

