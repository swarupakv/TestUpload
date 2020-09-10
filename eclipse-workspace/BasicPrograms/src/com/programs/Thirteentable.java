package com.programs;

import java.util.Scanner;

public class Thirteentable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter t:");
		int t = sc.nextInt();
		System.out.print("Enter n:");
		int n = sc.nextInt();
		//int t =15, n=20;
		
		for(int i=0; i<=n; i++)
		{
			System.out.println(t+" * "+i +" = " + t*i);
		}
		
	}

}
