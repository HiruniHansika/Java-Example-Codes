package com.Java.Questions.shapes.util;

public class RectangleUtils {
	private RectangleUtils(){
		
	  }
	public static double calculateArea(double length, double breadth){
		return length*breadth;
	}

	public static double calculatePerimeter(double length, double breadth ){
		return (2*length)+ (2*breadth);
	}
}
