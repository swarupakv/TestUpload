//5! = 5*4*3*2*1 = 120

package com.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Factorial Number:");
		int n = sc.nextInt();

		long fact =1;
		
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of "+ n +" is:"+fact);
	}

}

//Enter Factorial Number:15
//Factorial of 15 is:1307674368000
