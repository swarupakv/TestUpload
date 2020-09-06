package com.inheritance;

class testA {
	static int amount = 200;
}

class testB extends testA {
	static int students = 20;
}

class MultilevelInheritance extends testB {

	public static void main(String[] args) {

		System.out.println(amount);
		System.out.println(students);
	}

}

/*


OUTPUT:

200
20

*/