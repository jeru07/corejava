package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/**
 * 
 * @author jeru3112
 * @category to test Demo,fields and methods
 * date:march 24 2022
 *
 */


public class VariableTester {
/** 
 * test static,constant,immutable variables
 */
	public static void testGlobalVariable()
	{
		System.out.println(""+Demoa.DataA);
		//System.out.println("data b"+Demoa.DataB);
		System.out.println("data c "+Demoa.Datac);
		
		Demoa.DataA=2345;
		System.out.println("data A "+Demoa.DataA);
		
		/**
		 * error;final demo.DataC cannot be assigned
		 */
		
		
		
	}
	public static void testImmutableVaraible()
	{
		/**
		 * create an object or class
		 * pass value to argument constructor
		 * access the immutable field using object reference
		 */
		
		Demoa firstObject=new Demoa(123);
		System.out.println(firstObject.DataB);
		/**
		 * value assigned to immutable field cannot be changed
		 * can be assigned only through constructor
		 */
		//firstObject.DataB=567;
		
	}
	/**
	 * calling static method
	 * without creating an object
	 * created on ;25 march 2022
	 */
	
	public static void testStaticMethod()
	{
		Demoa.sayHello();
	}
	public static void testNonStaticMethod() {
		Demoa firstObject=new Demoa(111);
				firstObject.greetUser();
	}
}
