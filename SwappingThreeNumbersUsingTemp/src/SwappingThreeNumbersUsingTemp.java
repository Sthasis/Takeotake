
public class SwappingThreeNumbersUsingTemp {
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		System.out.println(" <-----------Before swapping these 3 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		
		int temp = secondNumber; 
		secondNumber = firstNumber;
		firstNumber = thirdNumber;
		thirdNumber = temp;
		
		System.out.println(" \n <-----------After swapping these 3 Numbers-------->");
		System.out.println("value of first number: "+ firstNumber);
		System.out.println("value of second number: "+ secondNumber);
		System.out.println("value of Third number: "+ thirdNumber);
		
		
		
	}

}
