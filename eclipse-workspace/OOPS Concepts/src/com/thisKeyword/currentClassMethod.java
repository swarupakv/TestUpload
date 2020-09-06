package com.thisKeyword;

class demo
{
	void display() //concrete method, regular method
	{
		System.out.println("hello");
	}
	void show()
	{
		this.display();
	}
}

public class currentClassMethod {

	public static void main(String[] args) {
		demo d = new demo();
		d.show();
	}

}

//hello


