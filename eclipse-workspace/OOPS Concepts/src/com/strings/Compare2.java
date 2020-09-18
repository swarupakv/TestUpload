package com.strings;

public class Compare2 {

	public static void main(String[] args) {

		String s1 = "test1";
		String s2 = "test1";
		
		String s3 = new String("test1");
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s2==s3); //false
		
	}

}
