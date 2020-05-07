package com.amalitech.gcd;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = kybd.nextInt();
		System.out.println("Enter second number");
		int num2 = kybd.nextInt();
		int grtcmndiv=1;
		
		if(kybd.hasNextLine() || num1 < 0 || num2 < 0){
			System.out.println("Enter only positive integer");
			main(args);
		}
		
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1%i ==0 && num2%i == 0) {
				grtcmndiv=i;
			}
		}
		System.out.println("Greatest common number is " + grtcmndiv);
		
	}

}
