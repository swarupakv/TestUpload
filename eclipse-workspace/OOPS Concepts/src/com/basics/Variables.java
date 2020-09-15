package com.basics;

public class Variables {

	static int a = 10; //Instance 
	
	public static void test()
	{
		int b = 5; //local
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		int c = 15; //local variable
		System.out.println(a);
		Variables.test();
		System.out.println(c);
		
	}

}


/*

10
5
15

*/