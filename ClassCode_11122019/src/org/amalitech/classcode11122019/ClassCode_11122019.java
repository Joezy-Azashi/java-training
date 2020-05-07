package org.amalitech.classcode11122019;

public class ClassCode_11122019 {
	
	public static void main (String args[]) {
		
		//1. Declaring an integer
		
		int x;
		
		x = 2;
		
		int y;
		
		y = 7;
		
		System.out.println(x);
		
		System.out.println(x + y);
		
		//Addition
		String eql_str = " = ";
		String pre_stmnt_add = "x + y" + eql_str;
		
		System.out.println(pre_stmnt_add + x + y);
		
		System.out.println(pre_stmnt_add + (x + y));
		
		System.out.println("The above code has been reorganised");
		
		System.out.println(x + y + " " + pre_stmnt_add);
		
		//Multiplication
		
		String pre_stmnt_multiply = "x * y = ";
		
		System.out.println(pre_stmnt_multiply + (x * y));
		
		//Division
		String pre_stmnt_division = "x / y = ";
		System.out.println(pre_stmnt_division + x / y);
		
		//Concatenation
		
		//Casting
		
		double x_d = (double)x;

		double y_d = (double)y;
		
		System.out.println("x_d / y_d = " + x_d / y_d);
		
		//Using Float
		float x_f = (float)x;
		
		float y_f = (float)y;
		
		System.out.println("x_f / x_f = " + x_f / y_f);
		
		int a = ++x;
		
		System.out.println("a : "+a);
		
		int b = x++;
		System.out.println("b : " +b);
	}

}
