package com.amalitech.second_highest;

public class second_highest {
	public static void main(String[] args) {

		int temp = 0;

		int[] a = { 20, 30,90, 50, 4, 71, 80, 95 , 100 };
		
		for (int i = 0; i < a.length; i++)
		       {
		           for (int j = i + 1; j < a.length; j++)
		           {
		               if (a[i] > a[j])
		               {
		                   temp = a[i];
		                   a[i] = a[j];
		                   a[j] = temp;
		               }
		           }
		       }
			for(int i=0; i<a.length; i++) {
		       System.out.print(a[i] + ", ");
			}
		   }
}