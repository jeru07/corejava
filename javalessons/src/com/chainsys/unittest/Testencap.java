package com.chainsys.unittest;
import com.chainsys.encapsulation.*;
public class Testencap {
	
		public static void main(String[] args) 
		{
			Encap c1=new Encap();		
			//c1.setCustomerID(123);
			c1.setName("Tom "+(char)91);
			c1.setAddress("Some where in India");
			c1.setCity("Chennai");
			c1.setMobileNo(9888444411d);
			
			c1.echo();
			c1.placeOrder();
			c1.getFeedback();		
		}
	}

