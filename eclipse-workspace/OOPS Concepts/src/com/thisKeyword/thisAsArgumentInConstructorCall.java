package com.thisKeyword;

class demo3
{
	demo3(thisAsArgumentInConstructorCall d4)
	{
		System.out.println("demo class const");
	}
}
public class thisAsArgumentInConstructorCall {

	void m1()
	{
		demo3 d3 = new demo3(this);
	}
	public static void main(String args[])
	{
		thisAsArgumentInConstructorCall d = new thisAsArgumentInConstructorCall();
		d.m1();
	}
}

//demo class const