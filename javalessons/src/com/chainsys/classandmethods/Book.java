package com.chainsys.classandmethods;

public class Book {

	private final int bookNo;
	private int yearOfPublish;
	private String name;
	private String category;
	private String author;
	
	
	
	public Book(int bNo)
	{
		
		this.bookNo=bNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
