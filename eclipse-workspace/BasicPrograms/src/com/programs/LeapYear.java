package com.programs;

public class LeapYear {

	public static void main(String[] args) {

		//year = 2000
		//  2000%400 = yes   2000%4 = yes && 2000%100 = no
		
		int n = 1684;		
		
		if((n%400==0) ||((n%4==0) && (n%100!=0)))   // 1900%400 not equal 0 ; 1900%4 == 0 && 1900%100 equal 0       false||false = false
		{											// 1684%400 not equal 0 ; 1684%4 ==0 && 1684%100 not equal 0	false||true = true
													// 2000%400 equal 0 ; 2000%4 == 0 && 2000%100 equal 0       	true||false = true
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}

//1864 is leap year