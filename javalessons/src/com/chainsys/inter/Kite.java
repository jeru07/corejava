package com.chainsys.inter;

public class Kite {

	void fly(int distance)
	{
		System.out.println("fly1"+distance);
	
	}
	void fly (double time,int speed)
	{
		System.out.println("fly1"+time);
	}
	void fly(int time,int speed)
	{
		return time*speed;
	}
	void falll(String time)
	{
		System.out.println("fall1"+time);
	}
	int fall(int distance)
	{
		System.out.println("fall2"+distance);
		return distance;
	}
	void glide(int time)
	{
		System.out.println("glide"+time);
	}
	void glide(double time)
	{
		System.out.println("glide"+time);
}
}
