

import java.util.Scanner;

public class OddNUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int str = sc.nextInt();
		
		// Using ternary operator
		String number = str%2 != 0 ? "odd": "even";
		
		System.out.println("The number is "+ number);

	}

}
