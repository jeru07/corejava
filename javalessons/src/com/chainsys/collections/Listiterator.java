package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>StringArrayList=new ArrayList<String>();
		String s1="B";
		StringArrayList.add("C");
		StringArrayList.add(s1);
		StringArrayList.add("A");
		StringArrayList.add("E");
		StringArrayList.add(s1);
		StringArrayList.add("D");
		StringArrayList.add("F");
		StringArrayList.add(s1);
		
		Iterator<String> string_itr=StringArrayList.iterator();
		while(string_itr.hasNext())
		{
 		System.out.println(string_itr.next()+ "  ");
	}
		System.out.println();
		ListIterator<String> string_list_itr=StringArrayList.listIterator();
		while(string_list_itr.hasNext())
		{
			String element=string_list_itr.next();
			string_list_itr.set(element+" ---");
			
			}
		string_itr=StringArrayList.iterator();
		
		while(string_itr.hasNext())
		{
			Object element=string_itr.next();
			System.out.println(element+" ");
					
		}
		System.out.println();
		while(string_list_itr.hasPrevious())
		{
			String element=string_list_itr.previous();
			System.out.println(element+ " ");
		}
		}

}
