package com.amalitech.armstrong_num;

import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		
		Scanner kybd = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = kybd.nextInt();
		String new_num = Integer.toString(num);
		int temp = num;
		int sum=0;
		while (num > 0) {
		    System.out.println(num % 10);
		    sum=sum + (int)Math.pow((num % 10), new_num.length());
		    num = num / 10;
		}
		System.out.println("The cube of the digits is " + sum);
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong number");
		}else {
			System.out.println(temp + " is not an Armstrong number");
		}
		kybd.close();
	}

}
