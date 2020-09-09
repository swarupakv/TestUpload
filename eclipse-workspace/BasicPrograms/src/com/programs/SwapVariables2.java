package com.programs;

import java.util.Scanner;

public class SwapVariables2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.println("a=" +a);
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.println("b=" +b);
		
		a = a+b; //a = 30
		b = a-b; //b = 30-20 = 10
		a = a-b; //a = 30-10 = 20
		
		System.out.println("After Swapping a=" +a);
		System.out.println("After Swapping b=" +b);
	}
}

/*
 
Enter a: 10
a=10
Enter b: 20
b=20
After Swapping a=20
After Swapping b=10
 
 
 */
