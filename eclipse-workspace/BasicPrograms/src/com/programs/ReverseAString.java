
//swarupa
//0123456

package com.programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "Priyanka";
		int length = name.length();
		System.out.println("String Length: " +length);
		String rev = "";
		
		for(int i=length-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}

//String Length: 8
//aknayirP
