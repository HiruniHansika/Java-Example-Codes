package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q3 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter first input : ");
		String firstInupt = sc.next();
		System.out.print("enter second input : ");
		String secondInupt = sc.next();
		
		boolean isValidInputs = NumberUtils.validateNumbers(firstInupt,secondInupt);
		
		if(isValidInputs){
			int firstNumber = Integer.parseInt(firstInupt);
			int secondNumber = Integer.parseInt(secondInupt);
			System.out.println("sum is : "+NumberUtils.addNumbers(firstNumber,secondNumber));
		}else{
			System.out.println("Invlid Inputs");
		}
		
	}
}
