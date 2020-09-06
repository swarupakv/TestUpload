package com.thisKeyword;

class demo2
{
	void m1(demo2 d2) //demo2 d2 = class ref variable
	{
		System.out.println("M1 method");
	}
	
	void m2()
	{
		m1(this); 
	}
}

public class thisAsArgumentInMethodCall {

	public static void main(String args[])
	{
		demo2 d = new demo2();
		d.m2();
	}
}
