package com.thisKeyword;

class test1
{
	int i;  //i= instance variable          

void setValue(int i) // i = local variable
{
	this.i=i; //instance variable = local variable   i=20
}
void show()
{
	System.out.println(i);   //instance variable
}
}

public class currentThisClassVariable {

	public static void main(String[] args) {

	test1 t = new test1();
	t.setValue(20);
	t.show();
	
	}

}


//20