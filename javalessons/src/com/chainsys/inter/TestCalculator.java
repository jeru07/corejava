package com.chainsys.inter;

public class TestCalculator {
  int a=10;
  int b=20;
  int c;
      public void add(){
        c=a+b;
        System.out.println(c);

      }
       public void sub(){
        c=a-b;
        System.out.println(c);

      }
       public void mul(){
        c=a*b;
        System.out.println(c);

      }
       public void div(){
        c=a/b;
        System.out.println(c);

      }

    public static void main(String[] args) {
      Calculator cal = new Calculator();

      cal.add(90, 65);
      cal.multiply(5,50);
      cal.divide(50,2);
      
    }
 }