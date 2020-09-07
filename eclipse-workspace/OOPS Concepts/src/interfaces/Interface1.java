package interfaces;

interface i1
{
  void show();
}

public class Interface1 implements i1 {

	public void show()
	{
		System.out.println("1");
	}
	public static void main(String[] args) {
		Interface1 i2 = new Interface1();
				i2.show();
	}

}

//1

/*
 
1. Interface can have only abstract methods.
2. Interface cannot have concrete methods
3. by default methods appends public abstract
4. by default variables append public static final
5. It cannot be instantiated. 
 */
