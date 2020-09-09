package com.programs;

public class LargestOfThreeNumbers2 {

	public static void main(String[] args) {

		int a= 10;
		int b = 10;
		int c = 40;
		
		if(a>b && a>c)
		{
			System.out.println("A is larger");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is larger");
		}
		else if(c>a && c>b) 
		{
			System.out.println("c is larger");
		}
		else
		{
			System.out.println("All are equal");
		}
	}
}

//c is larger
