package com.Java.Questions.Util;

public class NumberUtils {
private NumberUtils(){
		
	}
public static final String EVEN_NUMBER = "even";
public static final String ODD_NUMBER = "odd";
	
	/**
	 * adding numbers and return the sum of the numbers
	 * @param numbers
	 * @return int
	 */
	public static int addNumbers(int... numbers){
		int sum = 0;
		for(int number : numbers){
			sum = sum+ number;
		}
		return sum;
	}
	
	/**
	 * validating the scanning input is integer representation
	 * @param numbers
	 * @return boolean
	 */
	public static boolean validateNumbers(String... numbers){
		boolean isValid = true;
		for(String number : numbers){
			isValid = validateNumber(number);
			if(!isValid){
				break;
			}
		}
		return isValid;
	}
	/**
	 * validate a number is the string representation
	 * @param number
	 * @return
	 */
	public static boolean validateNumber(String number){
		boolean isValid = true;
		try{
			Integer.parseInt(number);
		}catch(Exception e){
			isValid = false;
		}
		return isValid;
	}
	
	/**
	 * finding largest numbers among numbers
	 * @param numbers
	 * @return largest number
	 */
	public static int largestNumber(int... numbers){
		int largest = numbers[0];
		for(int number : numbers){
			if(largest<number){
				largest = number;
			}
		}
		return largest;
	}
	
	/**
	 * finding smallest number among numbers
	 * @param numbers
	 * @return smallest number
	 */
	public static int samllestNumber(int... numbers){
		int smallest = numbers[0];
		for(int number : numbers){
			if(number<smallest){
				smallest = number;
			}
		}
		return smallest;
	}
	
	/**
	 * finding the factorial of the given number
	 * @param number
	 * @return factorial
	 */
	public static int findFactorial(int number){
		int factorial = 1;
		for(int i=1;i<=number;i++){
			factorial = factorial*i;
		}
		return factorial;
	}
	
  /**
  * finding the reverse of the given number
  * @param number
  * @return sum
  */
  public static int Reverse_number(int number){
	  int reversedNumber = 0;
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number / 10;
		}
		return reversedNumber;
  }
  /**
   * find the quotient
   * @param number
   * @return
   */
  public static int Quotient(int dividend ,int divisor ){
	 
	  
      int quotient = dividend / divisor;
      
       return quotient;
     
  }
  
  /**
   * find the remainder
   * @param number
   * @return
   */
  public static int Remainder(int dividend ,int divisor){
	  
	 int  remainder = dividend % divisor;
     return remainder;
}
  /**
   * Swap two numbers using third variable
   * @param firstNumber
   * @param secondNumber
   */
  public static void swapTwoNumbers(int firstNumber,int secondNumber){
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("after swapping : "+firstNumber+" "+secondNumber);
	}
  /**
   * check whether the number is even or odd
   * @param number
   * @return
   */
  public static String EvenOdd(int number){
	  String message = ODD_NUMBER;
		if(number%2==0){
			message = EVEN_NUMBER;
		}
		return message; 
	
  }
 
  
  /**
   * calculate power of a number
   * @param base
   * @param exponent
   * @return
   */
  public static int power(int base ,int exponent ){ 
	  int result = 1;

	  for(int i=0;i<exponent;i++){
          result = result*base;
          
      }
      return result;
  }
  
   /**
    * finding the sum of natural numbers
    * @param number
    * @return
    */
  public static int SumOfNaturalNumbers(int number){
		int sum = 0;
		for(int i = 1; i <= number; ++i)
        {
            sum = sum + i;
            
        }
		return sum;
	}
  
   /**
    * to generate multiplication table 
    * @param number
    * @return
    */
  public static int Multiplcationtable(int number){
		
  for(int i=1; i <= 12; i++)
  {
      System.out.println(number+" * "+i+" = "+number*i);
  }
  return number;
  }
   
  /**
   * Fibonacci series
   * @param number
   * @return
   */
  public static int FibonacciSeries(int number){
	  int fn=0;
      int sn =1;
      int c;
      System.out.println(fn);
      System.out.println(sn);
       
      for(int n=1; n<= number;n++){
          c = fn+sn;
          fn=sn;
          sn=c;
          System.out.println(c); 
      }	
	  
	  return number;
	  }
  /**
   * fibonacci series up to certain number
   * @param number
   * @return
   */
  public static int FibonacciSeries2(int number){
	  int fn=0;
      int sn =1;
      int c ;
      while (fn <= number)
      {
          System.out.println(fn );
          c = fn+sn; 
          fn=sn;
          sn=c;
           
      }
      	  
	  return number;
	  }
  /**
   * Check for PalindromeNumber
   * @param number
   * @return
   */
  public static boolean isPalindromeNumber(int number){
		boolean isPalindrome = false;
		int reversedNumber = NumberUtils.Reverse_number(number);
		if(number == reversedNumber){
			isPalindrome = true;
		}
		return isPalindrome;
	}
  /**
   * check whether the number is prime or not
   * @param number
   * @return
   */
  public static int FactorsOfNumber (int number){
	  for(int i = 1; i <= number; i++) {
			if(number%i == 0) {
				System.out.println(i);
			}
	  }
	  return number;
  }
 /**
  * check whether the number is prime or not 
  * @param number
  * @return
  */
  public static boolean isPrimeNumber(int number){
	  boolean isPrime = true;
		for(int i=2;i<=(number/2);i++){
			if(number%i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	

/**
 * Prime Numbers Between Two Numbers	
 * @param firstLimit
 * @param secondLimit
 * @return
 */
  public static void PrimeNumbersBetweenTwoNumbers(int firstLimit,int secondLimit ){  
	
	 for ( int  i= firstLimit; i < secondLimit; i++) {
			if(NumberUtils.isPrimeNumber(i)){
				System.out.println(i);
			}
		}
  
  }

  /**
   * to find the average of numbers of the integer type array
   * @param numbers
   * @return
   */
  public static double AverageOfArray(int... numbers){
	  double sum = 0;
      for(int i=0; i < numbers.length ; i++)
       sum = sum + numbers[i];
      
       double average = sum / numbers.length;
       System.out.println("Average value of the array elements is : " + average); 
	  return average;
  }
  /**
   * Armstrong Numbers below 1000
   * @param number
   * @return
   */
  public static int ArmstrongNumbers(int number){
	 int ArmstrongNumber = 0 ;
	 int Sum = 0;
	 int R;
	 for(int i = 1; i <=number ; i++)
     {
		 ArmstrongNumber =  i;
         while(ArmstrongNumber > 0)
         {
             R = ArmstrongNumber % 10;
             Sum = Sum + (R * R * R);
             ArmstrongNumber = ArmstrongNumber / 10;
         }
         if(Sum == i)
         {
             System.out.println(i);
         }
    	 Sum = 0;

     }
	 return ArmstrongNumber;
  }
}
