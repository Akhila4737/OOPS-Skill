package Skill4;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date: ");
        String inputDate = sc.nextLine();

        try {
            // Convert string to LocalDate
            LocalDate date = LocalDate.parse(inputDate);

            // Get day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Print result
            System.out.println("Day of the week: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter in YYYY-MM-DD format.");
        }
    }
}