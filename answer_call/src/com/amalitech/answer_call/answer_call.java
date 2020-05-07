package com.amalitech.answer_call;

import java.util.Scanner;

public class answer_call {
	static boolean ismorning;
	static boolean ismum;
	static boolean sleeping;
	public static void main(String args[]) {
		
		inputs();
		incmn_call(ismorning, ismum, sleeping);
	}
	
	public static void inputs() {
Scanner kybd = new Scanner(System.in);

		System.out.println("Were you sleeping when the call came? (type response true/false) \\n1. true \\n2. false");
		sleeping = kybd.nextBoolean();
		
		System.out.println("Is it morning (type response true/false) \n1. true \n2. false");
		ismorning = kybd.nextBoolean();
		
		System.out.println("Is it your mum calling (type response true/false) \\n1. true \\n2. false");
		ismum = kybd.nextBoolean();
	}
	
	public static boolean incmn_call(boolean ismorning, boolean ismum, boolean sleeping) {
		boolean answerCell = true;
		
		if (sleeping==true) {
			answerCell = false;
			System.out.println("False \nDon't answer call");
		}
		else if(ismorning == true && ismum ==true) {
			answerCell = true;
			System.out.println("True \nAnswer call");
		}else {
			System.out.println("False \nDon't answer call");
	}
		return answerCell;
	}

}
