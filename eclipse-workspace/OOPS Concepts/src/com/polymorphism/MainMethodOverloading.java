package com.polymorphism;

public class MainMethodOverloading {

	int a;
	public static void main(String[] args) {
		
		System.out.println("54");
		MainMethodOverloading m1 = new MainMethodOverloading();
		m1.main(3);
	}
	
	public void main(int a) 
	{
		this.a =a;
		System.out.println(a);
		System.out.println("56");
		
	}

}


/*

54
3
56

*/