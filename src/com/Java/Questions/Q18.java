package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q18 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// getting the input from the user
		System.out.print("Input number : ");
		String input = sc.next();
		
		// validating the inputs
		boolean isVlaidInuputs = NumberUtils.validateNumbers(input);
		
		if(isVlaidInuputs){
			int number = Integer.parseInt(input);
			NumberUtils.Multiplcationtable( number);
		}else{
			System.out.println("Invalid Inputs");
		}
		
	}
}