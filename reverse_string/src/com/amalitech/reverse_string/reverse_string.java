package com.amalitech.reverse_string;
import java.util.*;

public class reverse_string {

	public static void main(String args[]) {
		
		Scanner kybd = new Scanner(System.in);
		
		System.out.println("Please enter string to be reversed: ");
		
		String str = kybd.nextLine();
		
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		kybd.close();
	}
	
}
