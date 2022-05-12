package com.chainsys.introduction;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taskc();
		
	}
public static void taskA() 
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("what is your name");
	String name=sc.next();
	sc.close();
	System.out.println(name);

}
public static void taskB() 
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("what is THE NUM");
	int firstValue=sc.nextInt();
	int result=firstValue*100;
	
	System.out.println(result);
	sc.close();

}
public static void taskc() {
	String s1="100";
	String s2="200";
	System.out.println(s1 + s2);
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	int z=x+y;
	System.out.println(z);

	
}
public static void taskD() {
	

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("what is your age");
int age=sc.nextInt();
if (age<=0)
{
	System.out.println("invalid age");
}
else if (age<18)
{
	System.out.println("sorry-you have to wait for your DL");
}
else
{
	System.out.println("HAPPY BIKING");
}
}
}
