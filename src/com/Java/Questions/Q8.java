package com.Java.Questions;
import com.Java.Questions.Util.NumberUtils;

public class Q8 {
	public static void main(String[] args) {
		int[] numbers = {4,5,9,11,6,3,2};
		int largestNumber = NumberUtils.largestNumber(numbers);
		System.out.println("largest number is : "+largestNumber);
		
		int smallestNumber = NumberUtils.samllestNumber(numbers);
		System.out.println("smallest number is : "+smallestNumber);
	}
}