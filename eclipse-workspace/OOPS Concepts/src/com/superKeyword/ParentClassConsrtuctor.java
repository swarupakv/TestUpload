package com.superKeyword;

class L
{
	L()
	{
		System.out.println("Class L");
	}
}

class M extends L
{
	M()
	{
		super();
		System.out.println("Class M");
	}
}

public class ParentClassConsrtuctor {

	public static void main(String[] args) {
		M ob = new M();
	}

}


/*
 * 
 OUTPUT:
 
Class Y
Class Z
  

  
 */