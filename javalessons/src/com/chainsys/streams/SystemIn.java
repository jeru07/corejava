package com.chainsys.streams;

import java.io.IOException;

public class SystemIn {

	public static void main(String[] args) throws IOException
	{
		System.out.println(System.in.getClass().getName());
		System.out.println(System.out.getClass().getName());
		System.out.println("please enter char");
		 int cl=System.in.read();
		    System.out.println (cl);
		    char c2=(char) cl;
		    System.out.println (c2);

	}

}
