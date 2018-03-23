package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q12 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// getting the inputs form the user
		System.out.print("enter first number : ");
		String firstInput = sc.next();
		System.out.print("enter second number : ");
		String secondInput = sc.next();
		
		// validating the inputs
		boolean isVlaidInuputs = NumberUtils.validateNumbers(firstInput, secondInput);
		
		// preparing the input and calling the swap method
		if(isVlaidInuputs){
			int firstNumber = Integer.parseInt(firstInput);
			int secondNumber = Integer.parseInt(secondInput);
			System.out.println("before swapping : "+firstNumber+" "+secondNumber);
			Q12.swapTwoNumbers( firstNumber, secondNumber);
			
			
		} else{
			System.out.println("Invalid Inputs");
		}
	}


	
	
	// swap two numbers
	public static void swapTwoNumbers(int firstNumber,int secondNumber){
	    firstNumber = firstNumber+secondNumber ;
	    secondNumber = firstNumber-secondNumber ;
		firstNumber = firstNumber-secondNumber;
		System.out.println("after swapping : "+firstNumber+" "+secondNumber);
	}
}

