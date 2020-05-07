package com.amalitech.anagram;

import java.util.*;

public class anagram {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String s1 = kybd.nextLine();
		char ch1 [] = s1.toLowerCase().toCharArray();
		
		System.out.println("Enter second string");
		String s2 = kybd.nextLine();
		char ch2 [] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		int counter = 0;
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch2.length; j++) {
				if(ch1[i] == ch2[j]) {
					counter++;
				}
			}
			
		}
		if(counter == ch1.length) {
			System.out.println("Strings are anagrams");
		}else {
			System.out.println("Strings are not anagrams");
		}
		kybd.close();
	}

}
