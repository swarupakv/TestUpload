package com.constructor;

class DefaultConstructor
{
	DefaultConstructor()
	{
		int i=5;
		String s = "name";
		System.out.println("Default Constructor is called");
		System.out.println(i+ " " +s);
	}

	
	
	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
	}

}

/*
 * OUTPUT:
 
Default Constructor is called
5 name
 
  
 */


