package com.chainsys.exceptions;

public class A {
	public static void m3() {
		try
		{
			m4();
			
		}
		catch(Exception e)
		{
			System.out.println("inside catch"+e.getMessage());
		 Throwable t1=e.getCause();
		 System.out.println("cause"+t1.getMessage());
		}
	}
	
	public static void m4() throws Exception
	{
		Exception e1=new Exception("error 1");
		//inner exception
		//e1 is nested inside e2
		Exception e2=new Exception("error 2",e1);
		//throw e2;
				
	}
	

}
