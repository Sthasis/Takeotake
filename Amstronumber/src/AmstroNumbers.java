import java.util.Scanner;

public class AmstroNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		int  originalNumber, temp, result = 0;

		originalNumber = number;

		while (originalNumber != 0)
		{
			temp = originalNumber % 10;
			result += Math.pow(temp, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

	}
}
