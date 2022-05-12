package com.chainsys.collections;

import java.io.Serializable;

public class Emp implements Serializable
{


private final int id;
 public String name;
 
 public Emp (int v1)
 {
	 id=v1;
 }
 public int getid()
 {
	 return id;
 }

 
 public boolean equals(Object obj)
 {
	 Class c1=obj.getClass();
	 boolean flag=false;
	 if (c1==this.getClass())
	 {
		 Emp other=(Emp)obj;
		 if(this.hashCode()==other.hashCode())
			 flag=true;
	 }
	 return flag;
	 
 
 }
 public int hashcode() {
	 return this.id;
 }
}
