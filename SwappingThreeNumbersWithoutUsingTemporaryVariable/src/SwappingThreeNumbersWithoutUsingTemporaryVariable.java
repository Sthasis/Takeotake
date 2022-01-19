
public class SwappingThreeNumbersWithoutUsingTemporaryVariable {

	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		System.out.println(" <-----------Before swapping these 3 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		//performing swapping without using any temporary Variable;
		firstNumber = firstNumber + secondNumber + thirdNumber;
		secondNumber = firstNumber - (secondNumber + thirdNumber);
		thirdNumber = firstNumber - (secondNumber + thirdNumber);
		firstNumber = firstNumber - (secondNumber + thirdNumber);
		
		System.out.println(" \n <-----------After swapping these 3 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		

	}

}
