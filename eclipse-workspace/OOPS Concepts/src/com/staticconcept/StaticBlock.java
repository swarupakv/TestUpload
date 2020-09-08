package com.staticconcept;

public class StaticBlock {

	static
	{
		System.out.println("test1");
	}
	static 
	{
		System.out.println("test3");
	}
	static 
	{
		System.out.println("test4");
	}
	public static void main(String[] args) 
	{
		System.out.println("test2");
	}

}

/*
test1
test3
test4
test2
*/