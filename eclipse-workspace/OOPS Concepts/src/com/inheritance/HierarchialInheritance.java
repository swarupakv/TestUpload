package com.inheritance;

class testE {
	int students = 10;
}

class testF extends testE {
	int amount = 100;

	public void totalAmount() {
		System.out.println("Total Amount:" + amount * students);
	}
}

class testG extends testE {
	int days = 2;

	public void totalRooms() {
		System.out.println("Total Rooms:" + days * students);
	}

}

class HierarchialInheritance {

	public static void main(String[] args) {
		testF ob1 = new testF();
		ob1.totalAmount();
		testG ob2 = new testG();
		ob2.totalRooms();
	}

}



/*
 * 
 * OUTPUT:
 * 
 * Total Amount:1000 
 * Total Rooms:20

 */
