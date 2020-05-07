package com.amalitech.index_number;
import java.util.Scanner;
public class index_number {

	public static void main(String[] args) {
		Scanner kybd = new Scanner (System.in);
		System.out.println("Please enter class number:");
		int class_num = kybd.nextInt();
		System.out.println("Please year of enrollment");
		int year = kybd.nextInt();
		String yr = Integer.toString(year);
		char c = yr.charAt(2);
		char d = yr.charAt(3);
		
		System.out.println(yr);
		String [] faculty = {"Science","Maths","Languages"};
		int [] faculty_num = {2,6,7,};
		
		String [] sci_dprt = {"Computer Science","Medicine"};
		int [] sci_dprt_num = {2,3};
		
		String [] math_dprt = {"Statistics","Probability"};
		int [] math_dprt_num = {1,7};
		
		String [] lang_dprt = {"Foreign","Local"};
		int [] lang_dprt_num = {4,5};
		
		String [] comsci_prg = {"ICT", "Software Engineering"};
		int [] comsci_prg_num = {1,2};
		
		String [] medicine_prg = {"Opitomolgy", "Child Birth"};
		int [] medicine_prg_num = {3,4};
		
		System.out.println("****** FACULTIES ******");
		
		for (int i=0; i<=faculty.length-1;i++) {
				
		System.out.println(faculty[i] + "  " + faculty_num[i]);
		}
		System.out.println("***********************");
		System.out.println("\nEnter your Faculty number");
		
		int ent_faculty_num = kybd.nextInt();
		
		System.out.println("****** DEPARTMENTS ******");
		
		if (ent_faculty_num == 2) {
			for (int i=0; i<=sci_dprt.length-1;i++) {
				System.out.println(sci_dprt[i] + "  " + sci_dprt_num[i]);
			}
			System.out.println("***********************");
			
			}else if(ent_faculty_num == 6) {
				
				for (int i=0; i<=math_dprt.length-1;i++) {
					System.out.println(math_dprt[i] + "  " + math_dprt_num[i]);
				}
			}else if(ent_faculty_num == 7) {
				for (int i=0; i<=lang_dprt.length-1;i++) {
					System.out.println(lang_dprt[i] + "  " + lang_dprt_num[i]);
			}
			}else {
				System.out.println("You can only enter a faculty number");
				main(args);
			}
		System.out.println("\nEnter your Department number");
		
		int ent_dprt_num = kybd.nextInt();
		
		System.out.println("****** PROGRAM ******");
		
		if (ent_dprt_num == 2) {
			for (int i=0; i<=comsci_prg.length-1;i++) {
				System.out.println(comsci_prg[i] + "  " + comsci_prg_num[i]);
			}
			System.out.println("***********************");
			
			}else if(ent_dprt_num == 3) {
				
				for (int i=0; i<=medicine_prg.length-1;i++) {
					System.out.println(medicine_prg[i] + "  " + medicine_prg_num[i]);
				}
			
			}else {
				System.out.println("You can only enter number shown");
				main(args);
			}
		
		int ent_prg_num = kybd.nextInt();
		
		if(ent_prg_num == 1) {
			
			System.out.printf("Index number is 08" + c + d + ent_faculty_num + ent_dprt_num + ent_prg_num + "%03d",class_num);
		}else if(ent_prg_num == 2) {
			System.out.printf("Index number is 08" + c + d + ent_faculty_num + ent_dprt_num + ent_prg_num + "%03d",class_num);
		}
		}
	}


