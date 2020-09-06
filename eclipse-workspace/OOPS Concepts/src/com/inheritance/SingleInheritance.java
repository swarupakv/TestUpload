package com.inheritance;

class testD
{
	int amount = 500;
}

class SingleInheritance extends testD {

	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		System.out.println(si.amount);
		
	}

}

/*

OUTPUT:

500

*/