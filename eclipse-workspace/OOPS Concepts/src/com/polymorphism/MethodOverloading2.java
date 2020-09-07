/*
1. same class name
2. same method name
3. Different args
 - No.of args
 - Type of args
 - Sequence of args
 */


package com.polymorphism;

public class MethodOverloading2
{
	void demo(String name, int a)
	{
		System.out.println("1");
	}
	void demo(int a, String name)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverloading2 mo = new MethodOverloading2();
		mo.demo(34, "Swarupa");
		mo.demo("Swarupa", 56);
	}

}

/*
OUTPUT:

2
1

 */
