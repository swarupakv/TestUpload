package com.programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		System.out.print("Enter operation:");
		String operation = sc.next();
		int result;
		
		switch(operation)
		{
		case "+": result=a+b;
				  System.out.println("Addition of" + a + "and" + b + "is" + result);
				  break;
		
		case "-": result=a-b;
		  		  System.out.println("Subtraction of" + a + "and" + b + "is" + result);
		          break;
		          
		case "*": result=a*b;
		  		  System.out.println("Multiplication of " + a + " and" + b + " is" + result);
		  		  break;
		  		  
		case "/": result=a/b;
		  		  System.out.println("Division of" + a + "and" + b + "is" + result);
		  		  break;
		  		  
		default: System.out.println("Invalid symbol");
				 break;
		}
		
	}

}  

/*
 
Enter a:8
Enter b:4
Enter operation:/
Division of8and4is2  
  
  
  
  
 */
