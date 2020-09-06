//Constructor Overloading
package com.constructor;

 class ParameterizedConstructor2 {

	int i;
	String n;
	int a;
	
	ParameterizedConstructor2(int id, String name)
	{
		i=id;
		n=name;
	}
	
	ParameterizedConstructor2(int id, String name, int amount)
	{
		i=id;
		n=name;
		a=amount;
	}
	
	ParameterizedConstructor2(int id, int amount)
	{
		i=id;
		a=amount;
	}
	
	void display() {
		System.out.println(i + " " +n+ " "+ a);
	}
	
	
	public static void main(String[] args) {

		ParameterizedConstructor2 pc1 = new ParameterizedConstructor2(111, "Swarupa");
		ParameterizedConstructor2 pc2 = new ParameterizedConstructor2(222, "Priya", 1000);
		ParameterizedConstructor2 pc3 = new ParameterizedConstructor2(222, 1000);
		pc1.display();
		pc2.display();
		pc3.display();
	}

}
 
 /*
  * OUTPUT:
  
111 Swarupa 0
222 Priya 1000
222 null 1000
    
  */

