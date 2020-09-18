package com.strings;

public class CharToString {

	public static void main(String[] args) {
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);
		System.out.println(s);
		
		String s1="Swarupa";//creating string by java string literal  
		char ch1[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch1);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s1); //literal
		System.out.println(s2); //convert char to string
		System.out.println(s3); //new 
		
	}

}
