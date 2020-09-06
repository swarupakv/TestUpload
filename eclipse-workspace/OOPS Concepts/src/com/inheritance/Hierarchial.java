package com.inheritance;

class HierarchicalInheritance {
	void DisplayA() {
		System.out.println("This is a content of parent class");
	}
}

// B.java
class A extends HierarchicalInheritance {
	void DisplayB() {
		System.out.println("This is a content of child class 1");
	}
}

// c.java
class B extends HierarchicalInheritance {
	void DisplayC() {
		System.out.println("This is a content of child class 2");
	}
}

// MainClass.java
class Hierarchical {
	public static void main(String args[]) {
		System.out.println("Calling for child class C");
		B b = new B();
		b.DisplayA();
		b.DisplayC();
		System.out.println("Calling for child class B");
		A a = new A();
		a.DisplayA();
		a.DisplayB();
	}
}

/*
 * 
 * Calling for child class C 
 * This is a content of parent class 
 * This is a content of child class 2 
 * Calling for child class B 
 * This is a content of parent class
 * This is a content of child class 1
 * 
 * 
 */