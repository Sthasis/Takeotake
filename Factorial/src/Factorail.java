import java.util.Scanner;

public class Factorail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
	    long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	            // factorial = factorial * i;
	            factorial *= i;
	        }
	        System.out.printf("Factorial of %d = %d", num, factorial);
	    }

	}
