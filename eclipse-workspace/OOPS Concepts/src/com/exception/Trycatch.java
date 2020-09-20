package com.exception;

public class Trycatch
{
public static void main(String args[])
{  
	   try
	   {  
	      //code that may raise exception  
	      int data=100/0;  
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e);
		}  
	   //rest code of the program   
	   System.out.println("rest of the code..."); 
	   
	   System.out.println("====================================================");
	   
	   try 
	   {
		   String s = null;
		   System.out.println(s.length());   
	   }
	  
	   catch(NullPointerException s1)
	   {
		   System.out.println(s1);
	   }
	   
	   finally
	   {
		   System.out.println("This code should be executed");
	   }
	   System.out.println("====================================================");
	  }  
	} 
/*
java.lang.ArithmeticException: / by zero
rest of the code...

*/