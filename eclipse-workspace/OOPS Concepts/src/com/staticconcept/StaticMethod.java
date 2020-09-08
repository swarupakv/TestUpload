package com.staticconcept;

public class StaticMethod {
	
	static void display()
	{
		System.out.println("1");
	}
	
	static void show()
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) {

		StaticMethod.display();
		StaticMethod.show();
		}

}

//1
//2