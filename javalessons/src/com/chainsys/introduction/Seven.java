package com.chainsys.introduction;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkName();
	}
public static void checkUserName() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String userName=sc.nextLine();
	sc.close();
	System.out.println("name is "+userName);
	char[] nameAsCharacters=userName.toCharArray();
	int lengthOfCharArray=nameAsCharacters.length;
	System.out.println("length of name is "+lengthOfCharArray);
	if (lengthOfCharArray<3)
	{
		System.out.println("name not less than 3");
		return;
	}
	if(lengthOfCharArray>15)
	{
		System.out.println("name not more than 15");
		return;
	}
	
	String nameInUppercase=userName.toUpperCase();
	nameInUppercase=userName.trim();
	char [] uppercaseCharArray=nameInUppercase.toCharArray();
	lengthOfCharArray=uppercaseCharArray.length;
	int asciivalue=0;
	
	
	for(int index=0;index<lengthOfCharArray;index++)
	{
		asciivalue=(int)uppercaseCharArray[index];
		System.out.println("ascii"+asciivalue);
		if(asciivalue<65 || asciivalue >90)
		{
		 if(asciivalue!=32)
			{
				System.out.println("invalid character");
				return;
			}
		}
	}
	
	}
	public static void checkName() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String userName=sc.nextLine();
		sc.close();
		System.out.println("name is "+userName);
		char[] nameAsCharacters=userName.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		System.out.println("length of name is "+lengthOfCharArray);
		if (lengthOfCharArray>8)
		{
			System.out.println("Name is More than 8 Character");
			return;
		}
}
}
