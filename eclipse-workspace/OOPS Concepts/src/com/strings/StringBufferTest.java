package com.strings;

public class StringBufferTest 
{
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		System.out.println(sb); //Hello Java
		
		StringBuffer sb1 =new StringBuffer("Hello "); 
		sb1.insert(1,"Java"); //HJavaello
		//StringBuffer insert(int index, String str)
		System.out.println(sb1);
		
		StringBuffer sb2 =new StringBuffer("Hello ");   //01234
		//StringBuffer replace(int startIndex, int endIndex, String str)
		sb2.replace(1,3, "Java"); //HJavalo
		System.out.println(sb2);
		
/*
 StringBuffer replace():
 
 It can replace one set of characters with another set inside a StringBuffer object by calling replace( ). 
 The substring being replaced is specified by the indexes start Index and endIndex. 
 Thus, the substring at start Index through endIndex–1 is replaced. The replacement string is passed in str.
 */
	
		StringBuffer sb3 =new StringBuffer("JavaProgram"); 
		sb3.reverse(); 
		System.out.println(sb3);
									
										
		StringBuffer sb4 =new StringBuffer("JavaProgram");   
		//StringBuffer delete(int startIndex, int endIndex)    endIndex–1
		sb4.delete(2, 7); 
		System.out.println(sb4);
		
		StringBuffer sb5 =new StringBuffer("JavaProgram");   
		sb5.deleteCharAt(4);
		System.out.println(sb5);
		

	}  
	
}


//Hello Java