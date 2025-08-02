package skill2;

import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first string:");
		        StringBuilder str1 = new StringBuilder(sc.nextLine());
		        System.out.print("Enter second string: ");
		        StringBuilder str2 = new StringBuilder(sc.nextLine());
		        System.out.println("First: " + str1);
		        System.out.println("Second: " + str2);
		        str2.insert(0, str1);
		        System.out.println("After joining:");
		        System.out.println("First: " + str1);
		        System.out.println("Second: " + str2);
		    }
		}
