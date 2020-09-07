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

class demo
{
	void show(String a, int b)
	{
		System.out.println("1");
	}
}
public class MethodOverriding2 extends test
{
	void show(String a, int b)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverriding2 m = new MethodOverriding2();
		m.show("name1", 12);  
		
		demo t = new demo();
		t.show("name2", 13);
	}
}

/*
 OUTPUT:
 2
 1
 */

//https://www.javatpoint.com/method-overriding-in-java