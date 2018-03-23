package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q20 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// getting the input from the user
		System.out.print("Fibonacci series Upto : ");
		String input = sc.next();
		
		// validating the inputs
		boolean isVlaidInuputs = NumberUtils.validateNumbers(input);
		
		if(isVlaidInuputs){
			int number = Integer.parseInt(input);
			
			NumberUtils.FibonacciSeries2( number);
		}else{
			System.out.println("Invalid Inputs");
		}
		
	}
}
