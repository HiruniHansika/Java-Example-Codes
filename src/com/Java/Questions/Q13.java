package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q13 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter dividend : ");
		String firstInupt  = sc.next();
		System.out.print("enter divisor : ");
		String secondInupt = sc.next();
		
		boolean isValidInputs = NumberUtils.validateNumbers(firstInupt,secondInupt);
		
		if(isValidInputs){
			
				
			int dividend   = Integer.parseInt(firstInupt);
			int divisor  = Integer.parseInt(secondInupt );
			int Quotient =NumberUtils.Quotient( dividend,divisor  );
			int Remainder =	NumberUtils.Remainder (dividend,divisor);	
			System.out.println("Quotient = " + Quotient);
			System.out.println("Remainder = " + Remainder );
			
		}else{
			System.out.println("Invalid Inputs");
		}
		
	}
}
