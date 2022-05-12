package com.chainsys.introduction;

public class Sixth {

	public static void main(String[] args) {
		
 int n=0;
 for(int i=0;i<=100;i++)
 {
	 System.out.println(i);
	 if (i%3==0&&i%5==0) {
		 System.out.println("fizz buzz"+i);
		 }
 
 else if(i%3==0) {
	 System.out.println("fizz"+i);
 }
	
 else if (i%5==0){
 System.out.println("buzz"+i);
 }
	 
	}

}
}
