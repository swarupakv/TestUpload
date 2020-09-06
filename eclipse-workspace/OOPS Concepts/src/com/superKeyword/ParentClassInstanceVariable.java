package com.superKeyword;

class A
{
	int a = 10;
}

class B extends A
{
	int a = 20;
	
	void show(int a)  // a= local variable
	{
		System.out.println(a);  //a= local variable                     //30
		System.out.println(this.a); //a = instance variable             //20
		System.out.println(super.a);									//10
	}
}


public class ParentClassInstanceVariable {

	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.show(30);
	}

}


/*
 * 
 OUTPUT:
 
30
20
10
  
 */