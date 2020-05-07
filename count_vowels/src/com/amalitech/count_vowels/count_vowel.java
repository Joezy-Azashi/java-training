package com.amalitech.count_vowels;

import java.util.Scanner;

public class count_vowel {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter string");
		String str = kybd.next();
		int vowel_count = 0;
		int cons_count = 0;
		char vowels [] = {'a','e','i','o','u'};
		char ch [] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<vowels.length; j++) {
				if(ch[i] == vowels[j]) {
					vowel_count++;
				}else if(ch[i] != vowels[j]) {
					cons_count= ch.length - vowel_count;
				}
			}
		}
		System.out.println("Vowels are " + vowel_count + " and consonants are " + cons_count);
		kybd.close();
	}

}
