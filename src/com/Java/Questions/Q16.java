package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q16 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter base : ");
		String firstInupt  = sc.next();
		System.out.print("enter exponent : ");
		String secondInupt = sc.next();
		
		boolean isValidInputs = NumberUtils.validateNumbers(firstInupt,secondInupt);
		
		if(isValidInputs){
			
				
			int base   = Integer.parseInt(firstInupt);
			int exponent = Integer.parseInt(secondInupt );
			int power =NumberUtils.power( base,exponent  );
			System.out.println("Power = " + power);
			
		}else{
			System.out.println("Invalid Inputs");
		}
		
		
	}
}
