import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 4 digits numbers," +" for example 1994:" );
		int str = sc.nextInt();
		
		// Using ternary operator
		String number = str%4 == 0 ? "LeapYear": "not leap year";
		
		System.out.println("The year is a "+ number);

	}

}
