package com.thisKeyword;

class test
{
	int i;  //i= instance variable

void setValue(int x) // x = local variable
{
	i=x;
}
void show()
{
	System.out.println(i);
}
}

public class currentClassVariable {

	public static void main(String[] args) {

	test t = new test();
	t.setValue(20);
	t.show();
	
	}

}


//20