package com.chainsys.inter;


class Overload {

 static int Multiply(int a, int b)
 {

     return a * b;
 }

 static double Multiply(double a, double b)
 {

     return a * b;
 }
}


class A {


 public static void main(String[] args)
 {

   
     System.out.println(Overload.Multiply(2, 4));
     System.out.println(Overload.Multiply(5,6));
 }
}