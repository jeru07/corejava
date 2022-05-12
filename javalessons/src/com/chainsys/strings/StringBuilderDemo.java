package com.chainsys.strings;

public class StringBuilderDemo {
	
	public static void testA()
	{
			String firstString="hello how are you today.Is whether hot or cold";
		
			StringBuilder stringbuilder= new StringBuilder();
			stringbuilder.ensureCapacity(250);
			System.out.println("length= "+stringbuilder.length());
			System.out.println("capacity= "+stringbuilder.capacity());
			
			firstString="wish it rains this week";
			stringbuilder.append(firstString);
			System.out.println("buffer " +stringbuilder);
			System.out.println("length "+stringbuilder.length());
	
		    System.out.println("capacity "+stringbuilder.capacity());
	      
		    stringbuilder.trimToSize();
		    System.out.println("\t length=" + stringbuilder.length());
		    System.out.println("\t capacity =" + stringbuilder.capacity());
		    stringbuilder.replace(3, 8, "this is a Test--");
		    System.out.println("replace = " + stringbuilder);
	
		    stringbuilder.delete(5, 20);
		    System.out.println("delete="+stringbuilder);
		    System.out.println("\t length="+stringbuilder.length());
		    System.out.println("\t capacity"+stringbuilder.capacity());
	        
		    stringbuilder.insert(1, "THIS IS AUGUST");
		    System.out.println("INSERT="+stringbuilder);
		    System.out.println("\t length="+stringbuilder.length());
		    System.out.println("\t capacity"+stringbuilder.capacity());
	}
	

}
