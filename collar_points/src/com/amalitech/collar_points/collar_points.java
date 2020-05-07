package com.amalitech.collar_points;

import java.util.Scanner;

public class collar_points {
	
	//main class where program starts running
	public static void main(String[] args) { 
        Scanner kybd = new Scanner(System.in);
        
        //accepting the number of rows and columns for matrix
        System.out.print("Enter number of rows and columns in the matrix : ");
        int row = kybd.nextInt();
        int column = kybd.nextInt();
        
        //accepting elements into matrix
        System.out.print("Enter elements of Matrix : ");
        int matrix[][] = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = kybd.nextInt();
            }
        }
        //print matrix with entered values
        System.out.println("Entered Matrix : " );
        for(int m = 0; m < row; m++){
            for(int n = 0; n < column; n++){
                System.out.print(" " +matrix[m][n]+"\t");
            }
            System.out.println();
        }
        
     // call method to find collar point in matrix
        srch_collar_point(matrix);
        kybd.close();
	}
        
        
        static void srch_collar_point(int[][] matrix){
        	
        	for (int i = 0; i < matrix.length; i++) {
                int row_max = matrix[i][0];
                 
                int columnIndex = 0;
                int rowIndex = 0;
                
                boolean cp_bool = true;   
                
                //Finding the largest element in the row
                for (int j = 1; j < matrix[i].length; j++)
                {
                    if(matrix[i][j] > row_max)
                    {
                        row_max = matrix[i][j];
                         
                        columnIndex = j;
                        rowIndex = i;
                    }
                }  
                
                //Check if largest value in row is the smallest in its column
                for (int j = 0; j < matrix.length; j++)
                {
                    if(matrix[j][columnIndex] < row_max)
                    {
                        cp_bool = false;        
                        break;
                    }
                }
                 //print collar points
                if(cp_bool)
                {
                    System.out.println("List of Collar Points in Matrix A: A[" + (rowIndex + 1) + "," + (columnIndex + 1) + "] = " + row_max);
                }
            }
        	
        } 
	    
}
