package com.Java.Questions.shapes.util;

public class CircleUtils {
private CircleUtils(){
		
	}
	
	public static double calculateArea(double radius){
		return Math.PI*radius*radius;
	}
	
	public static double calculateCircumference(double radius){
		return 2*Math.PI*radius;
	}
}
