package com.polymorphism;

public class TypePromotion2 {

void display(float a)
{
	System.out.println("float method");
}
	
void display(String a)
{
	System.out.println("String method");
}	
		
	public static void main(String[] args) {
		TypePromotion2 tp1 = new TypePromotion2();
		//tp1.display(10);
		tp1.display("Priya");
		tp1.display(2);
	}

}

/*

OUTPUT:

String method
float method

*/

//   https://www.javatpoint.com/method-overloading-in-java
//   https://www.journaldev.com/16807/method-overloading-in-java
