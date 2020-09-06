package com.thisKeyword;

class demo7 {
	
	demo7 m1() 
	{
		return this;
	}

	void message() 
	{
		System.out.println("test");
	}
}

public class currentClassInstanceFromTheMethod {

	public static void main(String[] args) {
		demo7 d7 = new demo7();
		d7.message();
	}

}


//test