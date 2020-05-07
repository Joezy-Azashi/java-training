package com.amalitech.removing_spaces;
import java.util.Scanner;
public class removing_spaces {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter sentences");
		
		String str = kybd.nextLine();
		char ch[] = str.toCharArray();
		char ch2 [] = new char[100];
		int m=0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != ' ') {
				ch2[m++] = ch[i];
			}
		}
		for(int j=0; j<ch2.length; j++) {
			System.out.print(ch2[j]);
		}
		kybd.close();
	}

}
