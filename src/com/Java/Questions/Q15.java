package com.Java.Questions;
import java.util.Scanner;
import com.Java.Questions.Util.NumberUtils;

public class Q15 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter three inputs : ");
		String Input1 = sc.next();
		String Input2 = sc.next();
		String Input3 = sc.next();
		
		
		boolean isValidInputs = NumberUtils.validateNumbers(Input1,Input2,Input3);
		
		if(isValidInputs){
			int firstnumber = Integer.parseInt(Input1);
			int secondnumber = Integer.parseInt(Input2);
		    int thirdnumber  = Integer.parseInt(Input3);
		    int largest  ;
		    if (firstnumber > secondnumber && firstnumber > thirdnumber )
		         largest = firstnumber;
		      else if ( secondnumber > firstnumber && secondnumber > thirdnumber )
		    	  largest = secondnumber;
		      else
		    	  largest = thirdnumber;
		    System.out.println("Largest Number is : "+largest); 
		}else{
			System.out.println("Invalid Inputs");
		}
		
		
	}
}
