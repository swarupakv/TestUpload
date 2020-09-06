package com.constructor;

class DCNullValues {

	String name;
	int i;
	
	public void display()
	{
		System.out.println(i + " " + name);
	}
	
	
	
	public static void main(String[] args) {

		DCNullValues dc1 = new DCNullValues();
		DCNullValues dc2 = new DCNullValues();
		dc1.display();
		dc2.display();
	}

}

/*
 * OUTPUT:
 
0 null
0 null
 
  
 */

