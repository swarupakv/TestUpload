package com.superKeyword;

class X
{
	void m1()
	{
		System.out.println("Class X");
	}
}

class Z
{
	void m1()
	{
		System.out.println("Class Z");
	}
}

class Y extends Z
{
	void m1()
	{
		System.out.println("Class Y");
	}
	void show()
	{
		super.m1();
	}
}


public class ParentClassInstanceMethod {

	public static void main(String[] args) {
		Y obj2 = new Y();
		obj2.m1();
		obj2.show();
	}

}

/*
 * 
 OUTPUT:
 
Class Y
Class Z
  

  
 */
