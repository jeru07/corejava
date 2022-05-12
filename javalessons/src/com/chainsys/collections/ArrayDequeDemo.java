package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> arraydeque=new ArrayDeque<String>();
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("E");
		arraydeque.push("F");
		
		//System.out.println("before popping the stack;"+arraydeque.size());
		//while(arraydeque.peek()!=null)
		
		//	System.out.println(arraydeque.pop()+" ");
			//System.out.println("after popping the stack;"+arraydeque.size());
		Iterator<String> iterator=arraydeque.iterator();
		while(iterator.hasNext()) {
			System.out.println("\t"+iterator.next());
		}
		System.out.println("descending queue");
		Iterator<String> striterator=arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.println("\t"+striterator.next());
		}
		System.out.println("   ");
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator=arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+iterator.next());
		}
		System.out.println("######peek first:"+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("#####peek last"+arraydeque.peekLast());
		System.out.println(arraydeque);
		
		System.out.println("#####removefirst"+arraydeque.removeFirst());
		System.out.println(arraydeque);
		System.out.println("####removelast"+arraydeque.removeLast());
		System.out.println(arraydeque);
		
		System.out.println("remove firstoccurence;x"+arraydeque.removeFirstOccurrence(""));
		
		
	}

}
