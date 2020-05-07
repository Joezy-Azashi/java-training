package com.amalitech.area;
import java.util.*;
public class area {
	public static void main (String args[]) {
		Scanner kybd = new Scanner(System.in);
		
		System.out.println("Please enter the length");
		int len = kybd.nextInt();
		System.out.println("Please enter width");
		int wid = kybd.nextInt();
		int area = len* wid;
		System.out.println("Area is " + area);
		
	}

}
