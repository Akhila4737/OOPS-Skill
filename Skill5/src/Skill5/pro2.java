package Skill5;

import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        int count = 0;

        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        System.out.println("Value " + value + " found " + count + " time(s) in the array.");
    }        
	
}
