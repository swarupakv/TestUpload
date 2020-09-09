package com.programs;

public class Error {

	public static void main(String[] args) {

		int a= 60;
		int b = 70;
		int c = 50;
		
		if(a>b)
		{
			if(a>c) 
			{
				System.out.println("A is larger");
			}
			else
			{
				System.out.println("c is larger");
			}
		}
		else if(b>c)
		{
			System.out.println("B is larger");
		}
		else
		{
			System.out.println("c is larger");
		}
	}
}

//c is larger
