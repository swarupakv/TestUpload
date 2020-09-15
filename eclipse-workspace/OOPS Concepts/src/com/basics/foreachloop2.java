package com.basics;

public class foreachloop2 {

	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println("-------------------------------------");
		
		for(int temp:a)
		{
			System.out.println(temp);
		}
	}

}
