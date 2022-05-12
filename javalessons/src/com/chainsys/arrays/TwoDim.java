package com.chainsys.arrays;

public class TwoDim {
	public static void creatingTwod() {
    
	int twod[][]=new int [4][5];
	int rowIndex,colIndex=0;
	int data=0;
	for(rowIndex=0;rowIndex<4;rowIndex++)
	{
		for(colIndex=0;colIndex<5;colIndex++)
		{
			twod[rowIndex][colIndex]=data;
			data++;
		}
	}
	for(rowIndex=0;rowIndex<4;rowIndex++)
	{
		for(colIndex=0;colIndex<5;colIndex++)
		{
			System.out.println(twod[rowIndex][colIndex]);
		}
		System.out.println();
	}
}
	public static void calculateMarks()
	{ 
		int marks[][]=new int[][]
		{
			{45,6,7,4,2,0,0},
			{34,5,78,89,23,0,0},
			{6,72,1,35,6,0,0},
			{8,6,24,2,6,0,0},
			{7,56,3,5,79,0,0}};
		int rowIndex,colIndex,sum=0,avg=0;
		for(rowIndex=0;rowIndex<5;rowIndex++)
		{
			for(colIndex=0;colIndex<5;colIndex++)
			{
				sum+=marks[rowIndex][colIndex];
			}
			marks[rowIndex][5]=sum;
			marks[rowIndex][5]=sum/5;
		}
		int subjectNo=1;
		for(subjectNo=1;subjectNo<=5;subjectNo++)
		{
			System.out.println("sub"+(subjectNo)+" ");
		}
		System.out.println("total ");
		System.out.println("average");
		System.out.println("-----------------");
		for(rowIndex=0;rowIndex<5;rowIndex++)
		{
			for(colIndex=0;colIndex<7;colIndex++)
			{
				System.out.print(marks[rowIndex][colIndex]+" ");
			}
			System.out.println();
		}
	}
	
	 public static void unevenArrays() {
		 int uneventwod[][]=new int[4][];
		 uneventwod[0]=new int[1];
		 uneventwod[1]=new int[4];
		 uneventwod [2]=new int[3];
		 uneventwod[3]=new int [2];
		 int rowIndex,colIndex,rowlength=0,data=100;
		 for(rowIndex=0;rowIndex<4;rowIndex++)
		 {
			 rowlength=uneventwod[rowIndex].length;
			 for(colIndex=0;colIndex<rowlength;colIndex++)
			 {
				 uneventwod[rowIndex][colIndex]=data;
				 data++;
			 }
		 }
			 for(rowIndex=0;rowIndex<4;rowIndex++)
			 {
				 rowlength=uneventwod[rowIndex].length;
				 for(colIndex=0;colIndex<rowlength;colIndex++)
				 {
					 System.out.print(uneventwod[rowIndex][colIndex]+" ");
				 }
			 
			 
			 System.out.println();
		 }
		 }
		 
	 }

