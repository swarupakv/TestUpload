package com.polymorphism;

public class TypePromotion1 {

void display(int a)
{
	System.out.println("int method");
}
	
void display(String a)
{
	System.out.println("String method");
}	
		
	public static void main(String[] args) {
		TypePromotion1 tp1 = new TypePromotion1();
		//tp1.display(10);
		tp1.display("Priya");
		tp1.display('a');
	}

}

/*

OUTPUT:

String method
int method

*/
