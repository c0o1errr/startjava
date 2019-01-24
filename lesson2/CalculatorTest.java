import java.util.Scanner;

public class CalculatorTest {
	
	public static void main (String [] args) {
		// I read the entered numbers and pass through the setter

		Scanner scan = new Scanner(System.in);	
		Calculator calculatorOne = new Calculator();	
		System.out.print("Input first number: " + calculatorOne.getFirst());
		calculatorOne.setFirst(scan.nextInt());
		
		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /): " + calculatorOne.getOperator());		
        	calculatorOne.setOperator(scan.next().charAt(0));  

        	System.out.print("Insert second number: " + calculatorOne.getSecond());
		calculatorOne.setSecond(scan.nextInt());

		System.out.println("Результаты подсчетов = " + calculatorOne.calculate());

	}
} 