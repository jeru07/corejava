package com.chainsys.introduction;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         //taskA();
         taskC();
        // System.out.println("end.....");
	}
	public static void taskA() {
		int x=100;
		int y=200;
		int z=x+y;
		System.out.println("result = " + z);
	}
	public static void taskB() {
		int x=100;
		int y=200;
		int z=x+y;
		System.out.println("result = " + z);
	}


	
	public static void taskC()
	{
		System.out.println("Is It Raining ");
		Scanner sc=new Scanner(System.in);
		String rain=sc.nextLine();
		Scanner se=new Scanner(System.in);
		System.out.println("Temperature");
		int temp=se.nextInt();
		sc.close();
		boolean rain1;
		while(rain1=true)
		{
			System.out.println("Bring umbrella");
			if(temp<=32)
			{
			System.out.println("Bring Heavy Jacket");
			}
		    
			else if(temp>=32)
				
			{
				System.out.println("Bring light jacket");
			}
			
			else 
			{
				System.out.println("No Need jacket");
			}
			return;
		
		}	
		}
	}


	
	

	
	
	
	
	
	


