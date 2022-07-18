package com.chainsys.project;

import java.util.Scanner;

import com.chainsys.project.ExceptionManager;
import com.chainsys.project.InvalidInputDataException;
import com.chainsys.project.HTMLHelper;
import com.chainsys.project.LogManager;
import com.chainsys.project.Validator;

public class customerdata
{
Scanner s = new Scanner(System.in);
Scanner sc = new Scanner(System.in);
String customerName,type;
int number;
double current,previous,totalBill,units;
public void getdata()
{
	
System.out.print (" Enter consumer number  ");
number = s.nextInt();
try 
{
     Validator.CheckNumberForGreaterThanZero(number);
 }catch(InvalidInputDataException err) 
{      
		err.printStackTrace();
		return;
 }
System.out.print (" Enter Type of connection  (1 for Domestic or 2 for Commercial) ");
type = sc.nextLine();
System.out.print (" Enter consumer name  ");
customerName = sc.nextLine();
//System.out.print ("\n\t Enter previous month reading  ");
//previous= s.nextDouble();
System.out.print (" Enter current month reading  ");
current= s.nextDouble();
}
public void calc()
{
units=current;
if(type.equals("1"))
{
if (units<=100)
totalBill=1 * units;
else if (units>100 && units<=200)
totalBill=2.50*units;
else if(units>200 && units<=500)
totalBill= 4*units;
else
System.out.println("wrong");
}
else 
{
if (units<=100)
totalBill= 2 * units;
else if(units>100 && units<=200)
totalBill=4.50*units;
else if(units>200 && units<=500)
totalBill= 6*units;
else
totalBill= 7*units;
}
}
public void display()
{
System.out.println(" Consumer number = "+number);
System.out.println (" Consumer name = "+customerName);
if(type.equals("1"))
System.out.println (" type of connection  = DOMESTIC ");
else
System.out.println (" type of connection  = COMMERCIAL ");
System.out.println (" Current Month  Reading = "+current);
//System.out.println ("\n\t Previous Month  Reading = "+previous);
System.out.println (" Total units = "+units);
System.out.println (" Total bill = RS "+totalBill);
}
}