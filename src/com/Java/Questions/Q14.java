package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q14 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// getting the input from the user
		System.out.print("Input number : ");
		String input = sc.next();
		
		// validating the inputs
				boolean validInputs = NumberUtils.validateNumber(input);
				
				// preparing the input and calling the swap method
				if(validInputs){
					int number = Integer.parseInt(input);
					System.out.println(NumberUtils.EvenOdd(number));
					
				} else{
					System.out.println("Invalid Inputs");
				}
			}

		}


