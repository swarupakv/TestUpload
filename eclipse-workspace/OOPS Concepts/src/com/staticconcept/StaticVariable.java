package com.staticconcept;

public class StaticVariable {

	static int a=10; //instance or class variable
	void m1()
	{
		int b = 20; //local variable
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		
	}

}

//10
//20