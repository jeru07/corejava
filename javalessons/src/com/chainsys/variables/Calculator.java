package com.chainsys.variables;


/**
 * 
 * @author jeru3112
 *created on ;25 march 2022
 */
public class Calculator {
	/**
	 * add method
	 * static method object reference not required
	 * @param param1
	 * @param param2
	 * @return type in
	 */
	
	public static int add(int param1,int param2)
	{
		int result=param1+param2;
				return result;
					
	}
	/**
	 * divide method
	 * @param param1 int type
	 * @param param2 int type
	 * @return
	 */
	public static int divide(int param1,int param2)
	{
		if(param2==0) {
			System.out.println("parameter2 value must noy be zero");
			return 0;
		}
		int result=param1/param2;
				return result;
	}
	/**
	 * subtract method
	 * @param param1 int type
	 * @param param2 int type
	 * @return
	 */
	public static int subtract(int param1,int param2)
	{
		int result=param1-param2;
				return result;
	}
	/**
	 * add method
	 * static method object reference not required
	 * @param param1
	 * @param param2
	 * @return type in
	 */
	
	public static int multiply(int param1,int param2)
	{
		int result=param1*param2;
				return result;
	}
}
