package com.chainsys.arrays;

public class Arraysol {
	
	public static void bubblesort()
	{
		int [] nos= {11,34,2,4,6,78,54,345,78,1};
		System.out.println("original value before");
		for(int index=0;index<nos.length;index++)
		{
			System.out.print(nos[index]+" ");
		}
		System.out.println();
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count-1;j++)
			{
				if(nos[j+1]<nos[j])
				{
					temp=nos[j];
					nos[j]=nos[j+1];
					nos[j+1]=temp;
					temp=0;
				}
			}
		}
		
		
		System.out.println("value after sort");
		for(int index=0;index<nos.length;index++)
		{
			System.out.print(nos[index]+",");
		}
				
		}
	


}