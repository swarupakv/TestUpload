package com.strings;

public class Immutable {

	public static void main(String[] args) {

		 String s="Sachin";  
		 s.concat(" Tendulkar");//concat() method appends the string at the end  
		 System.out.println(s);//will print Sachin because strings are immutable objects
		 
		 String s1 = "Swarupa";
		 String s2 = " Kunapuli";
		 s1.concat(s2);
		 System.out.println(s1);
		 
		 String s3;
		 s3 = s1.concat(s2);
		 System.out.println(s3);
		 
		 s1 = s1.concat(s2);
		 System.out.println(s1);
	}

}
/*
Sachin
Swarupa
Swarupa Kunapuli
Swarupa Kunapuli
*/