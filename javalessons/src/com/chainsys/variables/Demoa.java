package com.chainsys.variables;

public class Demoa {
	
public static int DataA;
//static global variable
public final int DataB;
public final static int Datac=300;
private int dataD;
/**
 * Constructor is a special method
 * name of constructor and name of class will be same
 * don't have return type
 * it can take parameters
 * @param dataB
 */




public Demoa(int dataB)
{
	//assigning value global read only field
	this.DataB=dataB;
}

/**
 * static method can be called without an object
 */
public static void sayHello()
{
	System.out.println("hello developer");
}
public void greetUser()
{
	System.out.println("greetings user");
}

}
