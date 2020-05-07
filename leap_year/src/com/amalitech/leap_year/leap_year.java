package com.amalitech.leap_year;

import java.util.*;

public class leap_year {
	
	public static void main(String args[]) {
		
		Scanner kybd = new Scanner(System.in);
		
		int year = kybd.nextInt();
		
		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
			
			System.out.println("Leap year");
			
		}else {
			
			System.out.println("Not a Leap year");
			
		}
		kybd.close();
		
	}

}
