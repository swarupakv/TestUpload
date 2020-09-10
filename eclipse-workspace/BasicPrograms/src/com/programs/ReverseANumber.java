/*

n= 34546845   rev = 0

rem =345468%10        rem = 8
rev = rev*10 + rem     rev = 548
n = n/10               n= 345468

*/

package com.programs;

public class ReverseANumber {

	public static void main(String[] args) {
		int n = 6913;
		int rev =0;
		int rem;
		while(n!=0)
		{
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println(rev);
	}

}

//3196