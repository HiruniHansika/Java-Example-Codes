package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q9 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter number to find factorial :  ");
		String input = sc.next();
		boolean validInputs = NumberUtils.validateNumbers(input);
		if(validInputs){
			int number = Integer.parseInt(input);
			int factorial = NumberUtils.findFactorial(number);
			System.out.printf("factorial of %d is %d",number,factorial);
		}else{
			System.out.println("Invlid Inputs");
		}
	}
}
