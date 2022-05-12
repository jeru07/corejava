package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1); //use wrapper class
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println("contents of all;"+a1);
		//Object data[]=a1.toArray();
		int sum=0;
	//	for(int i=0;i<data.length;i++)
		//	sum+=((Integer)data[i]).intValue();
		
		Iterator<Integer> intIterator=a1.iterator();
		while(intIterator.hasNext())
			{
			  sum+= intIterator.next();
			}
		System.out.println("sum is "+sum);
	}

}
