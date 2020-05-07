package com.amalitech.remove_duplicate;

import java.util.*;

public class remove_dup {
	public static void main(String args[]) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num = kybd.nextInt();
		int arr[] = new int[num];
		int temp_arr [] = new int[num];
		int m=0;
		
		System.out.println("Enter elements");
		for(int i=0; i<num; i++) {
			arr[i] = kybd.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted list: ");
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a] + ", ");
		}
		System.out.println();
		for(int j=0; j<arr.length-1; j++) {
			if(arr[j] != arr[j+1]) {
				temp_arr[m++] = arr[j];
			}
		}
			temp_arr[m++] = arr.length;
			System.out.println("Array without duplicate is ");
			for(int k=0; k<temp_arr.length; k++) {
				System.out.print(temp_arr[k] + ", ");
		}
			kybd.close();
	}

}
