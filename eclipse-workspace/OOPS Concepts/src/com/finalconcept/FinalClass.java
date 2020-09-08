package com.finalconcept;

final class Bike1
{
	
}  

class FinalClass extends Bike1
{  
  void run()
  {
	  System.out.println("running safely with 100kmph");
	  }  
    
  public static void main(String args[])
  {  
	  FinalClass honda= new FinalClass();  
  honda.run();  
  }  
}

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: at com.finalconcept.FinalClass.main(FinalClass.java:12)