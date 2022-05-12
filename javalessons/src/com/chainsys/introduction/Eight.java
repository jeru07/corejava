package com.chainsys.introduction;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equation();
	}

		public static void findTotalofCubes() {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int num=sc.nextInt();
			int number,temp,total=0;
			number =num;
			while(number!=0)
			{
				temp=number%10;
				total=total+temp*temp*temp;
				number/=10;	
						
			}
			if(total==num)
			{
				System.out.println("Same input number");
			}
			
				else 
			{
					System.out.println("Different number");
			}
		
			}
		
		public static void Equation()
		{
			
		double funcx,x;
		int a,b;
		Scanner sw=new Scanner(System.in);
		System.out.println("enter the interval");
		a=sw.nextInt();
		b=sw.nextInt();
		sw.close();
		for(x=a;x<=b;x+=1)
		{
			funcx=2*x*x+ x + 5;
			System.out.println("x="+x+"and fx ="+funcx);
		}
	
	}
		
		
		
}
