package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;
import com.chainsys.classandmethods.Car;

public class BookTest {
	
	public static void testBook()
	{
		Book firstBook=new Book(3463);
		firstBook.setAuthor("Shakespeare");
		firstBook.setName("Julius Caesar");
		firstBook.setCategory("History");
		firstBook.setYearOfPublish(1800);
		System.out.println(firstBook.getAuthor());
		System.out.println(firstBook.getName());
		System.out.println(firstBook.getCategory());
		System.out.println(firstBook.getYearOfPublish());
		
	}
	

}
