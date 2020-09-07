package interfaces;

interface i3
{
	public abstract void show();
}

interface i4
{
	public abstract void display();
}

interface i5
{
	public abstract void priya();
} 

public class MultipleInheritance implements i3, i4, i5 {

	public void show()
	{
		System.out.println("test1");
	}
	
	public void display()
	{
		System.out.println("test2");
	}
	
	public void priya()
	{
		System.out.println("test3");
	}
	
	public static void main(String[] args) {

		MultipleInheritance mi = new MultipleInheritance();
		mi.display();
		mi.show();
		mi.priya();
	}

}

/*
OUTPUT:

test2
test1
test3

 */
