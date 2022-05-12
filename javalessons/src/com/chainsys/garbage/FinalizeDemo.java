package com.chainsys.garbage;



public class FinalizeDemo {
    public static void main(String args[]) throws Exception {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(100, 50));
       // c1.add(100, 50);
        System.out.println(c1);
       c1 = null;
        Calculator c2 = new Calculator();
        Calculator c3 = new Calculator();
        //creating object for runtime
        //not possible to create an object directly from runtime 
        //default constructor for runtime is private here
        //soo we use static method getruntime() of runtime class to create
        //an object for runtime
        
        Runtime rt = Runtime.getRuntime();// factorymethod
        rt.gc();
        c2=null;
        c3=null;
        rt.gc();
       // System.in.read();
    }
}