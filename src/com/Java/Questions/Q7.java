package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;
import com.Java.Questions.shapes.util.RectangleUtils;

public class Q7 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("enter length : ");
		String input1 = sc.next();
		System.out.print("enter breadth: ");
		String input2 = sc.next();
		
		boolean isValidInput = NumberUtils.validateNumbers(input1,input2);
		
		if(isValidInput){
			double length = Integer.parseInt(input1);
			double breadth = Integer.parseInt(input2);
			double perimeter = RectangleUtils.calculatePerimeter(length,breadth);
			System.out.println("Perimeter is : "+ perimeter);
		}else{
			System.out.println("Invlid Inputs");
		}
	}	
}