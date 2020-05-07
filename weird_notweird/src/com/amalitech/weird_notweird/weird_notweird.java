package com.amalitech.weird_notweird;

import java.util.Scanner;

public class weird_notweird {

	public static void main(String[] args) {
	Scanner kybd = new Scanner(System.in);
	
	int num = kybd.nextInt();
	
	if(num%2!=0) {
		
		System.out.println("Weird");
	}else if(num>=2 && num<=5) {
		
		System.out.println("Not weird");
	}else if(num>=6 && num<=20) {
		
		System.out.println("Weird");
	}else {
		
		System.out.println("Not weird");
	}
	main(args);
	kybd.close();
	}

}
