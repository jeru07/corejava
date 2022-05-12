package com.chainsys.inter;

public class work implements employee,company{

    @Override
    public void employeeName() {
       
        System.out.println("name is jerusha");
        
    }

    @Override
    public void position() {
       
        System.out.println("trainee ");
        
    }

    @Override
    public void companyname() {
        
        System.out.println("chainsys");
        
    }

    @Override
    public void location() {
       
        System.out.println("chennai");
        
    }
    public static void main(String args[]) {
        work cf=new work();
        cf.employeeName();
        cf.position();
        cf.companyname();
        cf.location();
        
    }
}

