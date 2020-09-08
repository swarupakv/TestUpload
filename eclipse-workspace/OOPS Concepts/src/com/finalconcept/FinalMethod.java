package com.finalconcept;

class Bike
{  
	  final void run() //final method
	  {
		  System.out.println("running");
	}  
	}  
	     
	class FinalMethod extends Bike
	{  
	   void run()
	   {
		   System.out.println("running safely with 100kmph");
		  }  
	     
	   public static void main(String args[])
	   {  
	   FinalMethod honda= new FinalMethod();  
	   honda.run();  
	   Bike b = new Bike();
	   b.run();
	   }  
	} 
	
//Error: LinkageError occurred while loading main class com.finalconcept.FinalMethod
//	java.lang.VerifyError: class com.finalconcept.FinalMethod overrides final method com.finalconcept.Bike.run()V	