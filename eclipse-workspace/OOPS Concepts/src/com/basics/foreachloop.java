package com.basics;

public class foreachloop {

	public static void main(String[] args) {
		
		int[] a = {5,6,7,8,13,16,17,18,19};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		System.out.println("-------------------------------------");
		System.out.println(a.length);
		System.out.println("-------------------------------------");
		
		for(int temp:a)
		{
			System.out.println(temp);
		}
	}

}
