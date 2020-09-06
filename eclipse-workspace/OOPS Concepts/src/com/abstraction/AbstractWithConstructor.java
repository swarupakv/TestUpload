package com.abstraction;

abstract class Car {
	//constructor
	Car() 
	{
		System.out.println("car is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Car {
	void run() {
		System.out.println("running safely..");
	}
}

public class AbstractWithConstructor {

	public static void main(String[] args) {
		Car myCar = new Honda();
		myCar.run();
		myCar.changeGear();
	}

}


/*
 
 OUTPUT:
 
car is created
running safely..
gear changed
  
 
 */
