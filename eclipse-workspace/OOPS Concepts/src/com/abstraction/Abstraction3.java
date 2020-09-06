package com.abstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle drawn");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle drawn");
	}
}

public class Abstraction3 {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
	}

}

//Rectangle drawn
