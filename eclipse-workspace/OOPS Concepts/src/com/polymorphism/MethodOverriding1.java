/*
1. Different class name
2. same method name
3. Same args
 - No.of args
 - Type of args
 - Sequence of args
4. Inheritance IS-A relationship
 */


package com.polymorphism;

class test
{
	void show()
	{
		System.out.println("1");
	}
}
public class MethodOverriding1 extends test
{
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverriding1 m = new MethodOverriding1();
		m.show();  
		
		test t = new test();
		t.show();
	}
}

/*
 OUTPUT:
 2
 1
 */
