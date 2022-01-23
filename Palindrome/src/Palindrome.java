import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc.nextInt();
		int n,sum=0,temp;    
		temp=number;    
		  while(number>0){    
		   n=number%10; 
		   sum=(sum*10)+n;    
		   number=number/10;    
		  }    
		  	if(temp==sum)    
		  		System.out.println("palindrome number ");    
		  	else    
		  		System.out.println("not palindrome");    
		}  

	}

