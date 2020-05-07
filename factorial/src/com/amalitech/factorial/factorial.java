package com.amalitech.factorial;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[]) {
		
		Scanner kybd = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = kybd.nextInt();
		
		int fact=1;
		
		//System.out.print(num);
		
		for(int i=1; i<=num; i++) {
			
			fact = fact*i;
			System.out.print(i + " x ");
		}
		System.out.println("=" + fact);
		kybd.close();
	}

}
