package starPattern;

public class LeftTriangleStarPattern {
	static int n=4;
	public static void main(String[] args) {
		for (int i= 0; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println(" ");
        }
	}
}


/*

OUTPUT:
    *
   **
  ***
 ****
*****

*/