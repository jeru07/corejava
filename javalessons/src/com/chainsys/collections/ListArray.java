package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ListArray {

	public static void main(String []args)
	{
		lessonArray();
	}
	public static void lessonArray()
	{
		ArrayList<Emp> empArrayList=new ArrayList<Emp>(30);
		System.out.println("initemparraylist size of emparraylist "+empArrayList.size());
		try {
			for(int i=0;i<5;i++)
			{
				Emp e1=new Emp(i);
				e1.name="emp"+i;
				empArrayList.add(e1);
			}
			System.out.println("size of emparraylist after addition "+empArrayList.size());
			Emp e3=(Emp)empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("size of emparraylist after additionn "+empArrayList.size());
			 
			Emp e4=new Emp(4);
			e4.name="elon musk";
			empArrayList.add(e4);
			
			System.out.println("freq of (emp id-4) in arraylist "+Collections.frequency(empArrayList, e3) );
			
			Iterator<Emp> empIterator=empArrayList.iterator();
			while(empIterator.hasNext())
			{
				Object element=empIterator.next(); //current object
				Emp e1=(Emp) element;
				System.out.println("\t"+e1.getid()+ "  "+e1.name);
			}
		}
		catch(Exception err)
		{
			System.out.println("error"+err.getMessage());
		}
	}
}
