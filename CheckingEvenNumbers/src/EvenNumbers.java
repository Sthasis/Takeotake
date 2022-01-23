import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int str = sc.nextInt();
		
		// Using ternary operator
		String number = str%2 == 0 ? "Even": "odd";
		
		System.out.println("The number is "+ number);

	}

}
