package Skill5;

import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size1:");
       System.out.println("Enter size2:");
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[][] matrix=new int[n][m];
       System.out.println("Enetr elements of matrix:");
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<m;j++) {
    		   matrix[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("Sum of row:");
       for (int i = 0; i < n; i++) {
           int rowSum = 0;
           for (int j = 0; j < m; j++) {
               rowSum += matrix[i][j];
           }
           System.out.println("Row " + (i + 1) + ": " + rowSum);
       }
       System.out.println("Sum of each column:");
       for (int j = 0; j < n; j++) {
           int colSum = 0;
           for (int i = 0; i < n; i++) {
               colSum += matrix[i][j];
           }
           System.out.println("Column " + (j + 1) + ": " + colSum);
       }       
	}

}
