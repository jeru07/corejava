package com.chainsys.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		demoA();
	}
	public static void demoA()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("cut");
		ts.add("Fan");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("dog");
		ts.add("aag");
		ts.add("AAg");
		ts.add("event");
		ts.add("fan");
		ts.add("Delhi");
		ts.add("Carrot");
		ts.add("ball");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("fool");
		System.out.println("size"+ts.size());
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
}
