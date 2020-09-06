package com.constructor;

 class ParameterizedConstructor {

	int i;
	String n;
	
	ParameterizedConstructor(int id, String name)
	{
		i=id;
		n=name;
	}
	
	void display() {
		System.out.println(i + " " +n);
	}
	
	
	public static void main(String[] args) {

		ParameterizedConstructor pc1 = new ParameterizedConstructor(111, "Swarupa");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(222, "Priya");
		pc1.display();
		pc2.display();
	}

}
 
 /*
  * OUTPUT:
  
111 Swarupa
222 Priya
  
   
  */

