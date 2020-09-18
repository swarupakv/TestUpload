package com.strings;

public class Comapre1 {

	public static void main(String[] args) {

		String s1 = "test1";
		String s2 = "test2";
		String s3 = "Test1";
		String s4 = new String("test2");
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s2.equals(s4)); //true
			
	}

}
