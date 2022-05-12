package com.chainsys.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DemoA {
	
	
	public static void creatingAnotherArray()
	{
		int days[]=null;
		if(days==null)
		{
			System.out.println("days is null");
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size for days");
		int size=scanner.nextInt();
		scanner.close();
		//days is instatiated with a length equal to size
		days=new int [size];
		if(days!=null)
		{
			System.out.println("days is not null");
		}
		int lengthofdays=days.length;
		System.out.println("no of days "+lengthofdays);
		for(int i=0;i<lengthofdays;i++)
		{
			days[i]=(int)(Math.random()*10);
		}
		for (int x:days)
		{
			System.out.println(x);
		}
	}
	public static void createMonthArray() {
	int month[]=new int [12];
	int lengthofmonth=month.length;
	System.out.println("array length is"+lengthofmonth);
	for(int i=0;i<lengthofmonth;i++) {
		System.out.println(i+" "+month[i]+",");
}
	System.out.println();
	  month[1]=31;
	  for(int i=0;i<lengthofmonth;i++)
	  {
		  System.out.println(i+" "+month[i]+" ");
	  }
	  try
	  {
		  month[12]=31;
		  month[11]=31;
		  System.out.println("hi .....");
	  }
	  catch(Exception err)
	  {
		  System.out.println("ERROR!!"+err.getMessage());
	  }
	  int anotherMonth[]= {31,32,30,28,33,31,31,30};
	  lengthofmonth=anotherMonth.length;
	  System.out.println("array length is"+lengthofmonth);
	  for(int i=0;i<lengthofmonth;i++)
	  {
		  System.out.println(i+" "+anotherMonth[i]+" ");
	  }
	}
   
	public static void WorkingWithArray()
	{
		int numberArray[]=new int [10];
		for(int i=0;i<10;i++) 
			numberArray[i]=-3* i;
		System.out.println("original contents");
		int lengthofarray=numberArray.length;
		for(int i=0;i<lengthofarray;i++)
		{
			System.out.print(numberArray[i]+ " ");
		}
		System.out.println();
		Arrays.sort(numberArray);
		System.out.println("sorted ");
		for(int i=0;i<lengthofarray;i++) {
			System.out.print(numberArray[i]+" ");
		}
		System.out.println();
		Arrays.fill(numberArray,2,6,-1);
		System.out.println("after fill ;");
		for(int i=0;i<lengthofarray;i++)
		{
			System.out.print(numberArray[i]+" ");
		}
		System.out.println();
		int index=Arrays.binarySearch(numberArray, -9);
		System.out.println(index);//wrong value
		Arrays.sort(numberArray);
		for(int i=0;i<lengthofarray;i++)
		{
			System.out.print(numberArray[i]+" ");
		}
		System.out.println();
		index=Arrays.binarySearch(numberArray, -9);
		System.out.print(index);
	}
  
	public static void workingWithChar()
	{
		String s1="Today is a very hot day";
		char[] data=s1.toCharArray();
		int count=data.length;
		System.out.println("array length"+count);
		for(int i=0;i<count;i++) {
			System.out.println(data[i]+" "+(int)data[i]);
		}
		
	}
	
}
