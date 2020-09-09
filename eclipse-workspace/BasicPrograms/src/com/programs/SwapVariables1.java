package com.programs;

import java.util.Scanner;

public class SwapVariables1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.println("a=" +a);
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.println("b=" +b);
		
		int c;
		
		c=a; // c= 10
		a=b; // a= 20
		b=c; // b= 10
		
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
