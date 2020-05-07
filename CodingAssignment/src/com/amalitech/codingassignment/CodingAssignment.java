package com.amalitech.codingassignment;

import java.util.Scanner;

public class CodingAssignment {

	public static void main  (String[] args) {

	//Initializations
	//boolean program_Running_bool = false;
	String code_trigger_stater_str = "start";
	//String code_trigger_ender_str = "end";
	boolean stf = false;//variable to check if user has already entered start

	re_run_kybd_input(code_trigger_stater_str,stf);
	//We need a trigger to end the code

	}

	static String code_trigger_ender_str = "end";
	static String kybd_input_str="";

	private static void re_run_kybd_input(String code_trigger_stater_str, boolean stf) {
	boolean program_Running_bool=false;
	//boolean st1=false;
	Scanner kybd_input = new Scanner (System.in);
	kybd_input_str = kybd_input.nextLine();

	if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {
	program_Running_bool = true;
	stf = true;
	int x=0;
	int y=5;

	//We need a trigger to start the code
	while (program_Running_bool == true) {
	//the immediate code above is the same as
	//this very code below
	//while (program_Running_bool == true) {
	if(x<y) {


	System.out.println("We are still in the while: "
	//+x
	//the best way to do this is:
	+ Integer.toString(x));
	x= x + 1; //can also be written as x++
	}
	//x= x + 1;
	//we needed to move the code above
	//into the if (x<y) (..) code block

	else {
	program_Running_bool =false;
	stf = true;
	System.out.println("we are still in the while loop");
	kybd_input_str = kybd_input.nextLine();
	System.out.println("You enetered "+ kybd_input_str);
	}
	//2. we need a trigger to the end the code
	}

	System.out.println("hurray we are still in the while loop");
	}
	else if (kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
	if (stf) {
	System.out.println("The program has ended");
	//kybd_input.close();
	System.exit(0);
	}else {
	//System.out.println("Start the program before ending");
		System.out.println(CommonClass.restart_msg);
	}
	}
	else {
	System.out.println(// the user entered the wrong number
	"Please restart" + " and enter start to run code");
	stf=true;
	re_run_kybd_input(code_trigger_stater_str,stf);

	}
	stf=true;
	re_run_kybd_input(code_trigger_stater_str,stf);
	}


	}



