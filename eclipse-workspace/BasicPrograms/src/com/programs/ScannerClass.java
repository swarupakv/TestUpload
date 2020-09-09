package com.programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount = sc.nextInt();
		int total = amount * 10;
		System.out.println(total);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println(name);
	}

}

/*

Enter Amount: 
345
3450
Enter Name: 
Swarupa
Swarupa





*/