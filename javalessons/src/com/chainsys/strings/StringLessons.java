package com.chainsys.strings;

import java.util.Scanner;

public class StringLessons
{

	public static void lessonOne() {
		String firstString="chainsys";
		System.out.println(firstString);
		char dataOne[]= {'c','h','a','i','n'};
		 String secondString=new String(dataOne);
		 System.out.println(secondString);
		 String thirdString=new String(new char[] {'c','h','a','i','n'});
		 System.out.println(thirdString);
	}
	public static void lessonTwo()
	{
		String firstString="hello";
		String secondString="hello";
		String thirdString="hello";
		int firstNumber=100;
		int secondNumber=100;
		int thirdNumber=100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString="welcome";
		System.out.println(firstString);
		System.out.println(secondString);
		
	}
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1="hello";
		}
		
	}
	
	public static void stringToCharArray()
	{
		java.util.Scanner scanner=new Scanner(System.in);
		System.out.println("enter a word");
		String firstString =scanner.nextLine();
		scanner.close();
		
		int stringLength=firstString.length();
		System.out.println("length"+stringLength);
	char [] data=firstString.toCharArray();
	int dataarrayLength=data.length;
	System.out.println("length"+dataarrayLength);
	}
	
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner=new Scanner(System.in);
		System.out.println("enter a word");
		String firstString =scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase=firstString.toUpperCase();
		System.out.println("to uppercase"+stringInUppercase);
		System.out.println("s1="+firstString);
		String stringInLowercase=firstString.toLowerCase();
		System.out.println("to lowercase"+stringInLowercase);
		System.out.println("s1="+firstString);
		//substring
		//from 4 th to end
		String subString=firstString.substring(3);
		System.out.println(subString);
		
		//from index 2 to index 5
		subString=firstString.substring(2,6);
		System.out.println(subString);
		//replace
		String replacedString =firstString.replace('a', 'e');
		System.out.println(replacedString);
		//equals
		boolean flag1=firstString.equals(stringInUppercase);
		System.out.println(flag1);
		//equalsignorecase
		boolean flag=firstString.equalsIgnoreCase(stringInUppercase);
		System.out.println(flag);
		
		
	}
	

	public static void testStringTrim()
	{
		String secondString="   hope    it    rain   ";
		System.out.println(secondString.length());
		secondString=secondString.trim();
		System.out.println("after trim;" +secondString.length());
		
	}
	
	public static void testSplit()
	{
		String firstString=" Tom and Jerry are good friends";
		String trimmedString=firstString.trim();
		String[] data=trimmedString.split(" ");
		int count =data.length;
		System.out.println("word count "+ count);
		for (int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
		int reversedString=trimmedString.length();
		while(reversedString>0)
		{
			System.out.print(trimmedString.charAt(reversedString-1));
			reversedString--;
		}
		
		
		
	}
	
	public static void testSplitDays()
	{
		String firstString="mon,tue,wed,thrs,fri,sat,sun";
		String trimmedString=firstString.trim();
		String[] data=trimmedString.split(",");
		int count =data.length;
		System.out.println("days count "+ count);
		for (int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}
	public static void reverse()
	{
		   
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence="";
		try
		{
			sentence=scanner.nextLine();
		}
		finally
		{
			scanner.close();
			
		}
	    
		int reversedString=sentence.length();
		while(reversedString>0)
		{
			System.out.print(sentence.charAt(reversedString-1));
			reversedString--;
		}
		
	}
	
	public static void verifyString(String s1)
	{
		if(null==s1)
		{
			System.out.println("string is null");
			return;
		}
		else
			System.out.println(" string is not Null "+s1);
		
		if(!s1.isEmpty())
			System.out.println("\t not empty " + s1);
		else
			System.out.println("\t string is empty ");
	}
	
	
	
	
	
}
