package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class Banktest {

	public static void testdeposit()
	{
		System.out.println("before balance " +Bank.totalamount);
	   Bank.deposit(10000);
	   System.out.println("after balance " +Bank.totalamount);
	
	}
	public static void testWithdraW()
	{
		System.out.println("before balance" +Bank.totalamount);
	   int withdraw = Bank.withdraw(9000);
	   System.out.println("amount is " +withdraw);
	System.out.println("after balance " +Bank.totalamount);
	}
	public static void testOpenAccount()
	{
		Bank.openAccount("jerusha.j", 456789);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accNumber);
		
	}
}
