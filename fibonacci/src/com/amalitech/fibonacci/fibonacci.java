package com.amalitech.fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner kybd = new Scanner(System.in);
		int temp = 0;
		int fibo1 = 0;
		int fibo2 = 1;
		int T = kybd.nextInt();
		for(int i=0; i<=T; i++) {				
			System.out.print(fibo1 +",");
			temp = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = temp;
			
		}
		kybd.close();
	}

}
