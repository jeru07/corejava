package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

import com.chainsys.arrays.Employee;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

             demoA();
	}
	public static void demoA()
	{
		HashSet<String> string_hs=new HashSet<String>();
		string_hs.add("bee");
		string_hs.add("apple");
		string_hs.add("dol");
		string_hs.add(null);
		string_hs.add("egg");
		string_hs.add("cinema");
		string_hs.add("fan");
		System.out.println("size"+string_hs.size());
		string_hs.add("fan");
		string_hs.add(null);
		System.out.println("size"+string_hs.size());
		Iterator<String> set_itr=string_hs.iterator();
		while(set_itr.hasNext())
		{
			System.out.println(set_itr.next()+"-");
		}
		
	}
	public static void demoB()
	{
		HashSet<Emp> hs=new HashSet<Emp>();
		Emp e1=null;
		for(int i=0;i<10;i++) {
			e1=new Emp(i);
		
			e1.name="emp"+i;
			hs.add(e1);
		}
		
		System.out.println("count"+hs.size());
		e1=new Emp(9);
		hs.add(e1);
		System.out.println("count"+hs.size());
		Iterator<Emp> itr=hs.iterator();
		while(itr.hasNext())
		{
			
			Emp e2=itr.next();
			System.out.println(e2.getid()+" "+e2.name);
		}
		
	}
	
	
	

}
