package com.thisKeyword;

class demo1
{
	demo1()
	{
		this(45);
		System.out.println("no arguments constructor");
		
	}
	
	demo1(int a)
	{
		System.out.println("parameterized constructor");	
	}
}
public class currentClassConstructor {
	public static void main(String[] args) {
		demo1 d = new demo1();
		//demo1 d1 = new demo1(10);
		
	}

}

//parameterized constructor
//no arguments constructor
