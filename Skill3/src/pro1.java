import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();
        int bill = 0;

        if (units >= 51 && units <= 100) {
            bill = units * 3;
        } else if (units >= 101 && units <= 300) {
            bill = units * 5 + 100;
        } else if (units >= 301 && units <= 450) {
            bill = units * 6 + 200;
        } else if (units > 450) {
            bill = units * 8 + 250;
        } else {
            System.out.println("Units must be greater than 50.");
            return;
        }

        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: ₹" + bill);

	}

}
