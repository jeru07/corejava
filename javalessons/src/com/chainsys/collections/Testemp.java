package com.chainsys.collections;

public class Testemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Emp firstemp=new Emp(111);
		Emp secondemp=new Emp(111);
		
		System.out.println(firstemp.hashcode());
		System.out.println(secondemp.hashcode());
		
		boolean result=firstemp.equals(secondemp);
		System.out.println(result);
		
		result=firstemp.equals(firstemp);
		System.out.println(result);
		
		result=firstemp.equals("hello");
		System.out.println(result);
		
		
	}

}
