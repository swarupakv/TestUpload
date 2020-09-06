package com.abstraction;

abstract class Animal
{
	abstract void sound();
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	
}

class dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog barks");
	}
}


public class Abstraction1 {

	public static void main(String[] args) {
		dog testDog = new dog();
		testDog.sound();
		testDog.sleep();
	}

}

/*
 OUTPUT:
 
Dog barks
Animal is sleeping
 
 
 */
