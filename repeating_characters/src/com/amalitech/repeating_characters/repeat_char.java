package com.amalitech.repeating_characters;

import java.util.*;

public class repeat_char {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = kybd.nextLine();
		int count=0;
		
		char ch [] = str.toCharArray();
		Arrays.sort(ch);
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<ch.length; i++) {
			for(int j =i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
