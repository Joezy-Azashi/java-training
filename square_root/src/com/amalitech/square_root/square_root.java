package com.amalitech.square_root;

import java.util.Scanner;

public class square_root {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter number");
		int num = kybd.nextInt();
		double sum=0;
		sum = Math.pow(num, 0.5);
		System.out.println("The square root of " + num + " is " + sum);
	}

}
