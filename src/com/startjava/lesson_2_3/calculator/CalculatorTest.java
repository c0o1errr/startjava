package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static final Scanner scan = new Scanner(System.in);
	public static void main (String [] args) {
		// I read the entered numbers and pass through the setter
		do {	
			start();
			String again = scan.nextLine();
			if ("no".equals(again)) {
				System.out.println("Calculator closed!!!");
				break;				
			} 
		} while (true);				
	}	

	private static void start() {		
		Scanner scan = new Scanner(System.in);		
		Calculator calculate = new Calculator();  
		System.out.print("Input first number: " );  		
		calculate.setFirst(scan.nextInt());		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /, ^, % (remainder of the division)): ");
        	calculate.setOperator(scan.next().charAt(0));
        	System.out.print("Insert second number: " );
		calculate.setSecond(scan.nextInt());
		System.out.println("Counting results = " + calculate.calculate());
		System.out.println("Want to continue ? enter yes/no" );
	}		
}