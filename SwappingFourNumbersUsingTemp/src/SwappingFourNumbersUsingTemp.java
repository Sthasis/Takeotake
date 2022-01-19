
public class SwappingFourNumbersUsingTemp {

	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		int fourNumber = 40;
		System.out.println(" <-----------Before swapping these 4 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		System.out.println("value of Four number: "+ fourNumber);

		
		int temp = secondNumber; 
		secondNumber = firstNumber;
		firstNumber = thirdNumber;
		thirdNumber = fourNumber;
		fourNumber = temp;
		
		System.out.println(" \n <-----------After swapping these 4 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		System.out.println("value of fourth number: "+ fourNumber);

		

	}

}
