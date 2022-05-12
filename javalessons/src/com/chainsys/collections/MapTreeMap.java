package com.chainsys.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String, Double> tm=new TreeMap<String, Double>();

			tm.put("john", 3434.34);
			tm.put("tom smith ", 123.22);
			tm.put("jjane baker", 1378.00);
			tm.put("tod ", 99.22);
			tm.put("ralph ", -19.08);
			Set<Map.Entry<String, Double>> set=tm.entrySet();
			Iterator<Map.Entry<String, Double>> i=set.iterator();
			
			while(i.hasNext())
			{
				Map.Entry<String, Double> me=i.next();
				System.out.println(me.getKey()+";");
				System.out.println(me.getValue());
			}
			System.out.println();
			
			double balance=tm.get("john");
			tm.put("john", (balance+1000));
			System.out.println("john new balance"+tm.get("john"));
	}

}
