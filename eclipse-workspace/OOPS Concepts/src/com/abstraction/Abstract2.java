package com.abstraction;

abstract class Bike
{
	abstract void run();
}

class Abstract2 extends Bike{
	
void run()
{
	System.out.println("Running Fastly");
}
	
	public static void main(String[] args) {
		Bike test = new Abstract2();
		test.run();
	}

}

// Running Fastly