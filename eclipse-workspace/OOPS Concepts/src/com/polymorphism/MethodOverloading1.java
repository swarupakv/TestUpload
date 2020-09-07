/*
1. same class name
2. same method name
3. Different args
 - No.of args
 - Type of args
 - Sequence of args
 */


package com.polymorphism;

public class MethodOverloading1
{
	void show()
	{
		System.out.println("1");
	}
	void show(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverloading1 mo = new MethodOverloading1();
		mo.show();
		mo.show(10);
	}

}

/*
OUTPUT:

1
2 

 */
