
public class SwappingFourNumbersWithout {

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

		//performing swapping without using any temporary Variables
		firstNumber = firstNumber + secondNumber + thirdNumber + fourNumber;
		secondNumber = firstNumber - (secondNumber + thirdNumber + fourNumber);
		thirdNumber = firstNumber - (secondNumber + thirdNumber+ fourNumber);
		fourNumber = firstNumber - (secondNumber + thirdNumber+ fourNumber);
		firstNumber = firstNumber - (secondNumber + thirdNumber + fourNumber);
		
		System.out.println(" \n <-----------After swapping these 4 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		System.out.println("value of fourth number: "+ fourNumber);

	}

}
