package com.amalitech.bubble_sort;

import java.util.Scanner;

public class bubble_sort{
	public static void main(String[] args) {
		
		int[] arr = input(args);
		
		sorting(arr);
		     
		   }

	public static int[] input(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = kybd.nextInt();
		
		if(size<=0) {
			System.out.println("Enter a positive number");
			main(args);
		}
		int arr[] = new int[size];
		int temp = 0;
		
		System.out.println("Enter elements into the array");
		for(int m=0; m<arr.length; m++) {
			arr[m] = kybd.nextInt();
		}
		return arr;
	}

	public static void sorting(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++)
		       {
		           for (int j = i + 1; j < arr.length; j++)
		           {
		               if (arr[i] > arr[j])
		               {
		                   temp = arr[i];
		                   arr[i] = arr[j];
		                   arr[j] = temp;
		               }
		           }
		       }
		System.out.print("Sorted array list is ");
		       for(int n=0; n<arr.length; n++) {
		    	   System.out.print(arr[n] + ", ");
		       }
	}
}
