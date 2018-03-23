package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q23 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter firstLimit : ");
		String firstinput = sc.next();
		System.out.print("enter secondLimit : ");
		String secondinput = sc.next();
		
		boolean isValidInputs = NumberUtils.validateNumbers(firstinput,secondinput);
		
		if(isValidInputs){
			int firstLimit = Integer.parseInt(firstinput);
			int secondLimit = Integer.parseInt(secondinput);
			NumberUtils. PrimeNumbersBetweenTwoNumbers( firstLimit, secondLimit );  
		}else{
			System.out.println("Invalid Inputs");
		}
		
   }
}  
