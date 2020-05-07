package com.amalitech.palindrom;

import java.util.Scanner;

public class palindrom {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = kybd.nextLine();
		String reverse = "";
		int length = str.length();
		for (int i = length-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print(reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println(" is a palindrom");
		}
		else {
			System.out.println(" is not a palindrom");
		}
	}

}
