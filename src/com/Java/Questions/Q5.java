package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;
import com.Java.Questions.shapes.util.CircleUtils;

public class Q5 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter radius : ");
		String input = sc.next();
		
		boolean isValidInput = NumberUtils.validateNumbers(input);
		
		if(isValidInput){
			double radius = Integer.parseInt(input);
			double Circumference = CircleUtils.calculateCircumference(radius);
			System.out.println("Circumference is : "+ Circumference);
		}else{
			System.out.println("Invlid Inputs");
		}
	}
	
}

