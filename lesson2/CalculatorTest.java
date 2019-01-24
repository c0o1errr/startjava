import java.util.Scanner;

public class CalculatorTest {
	
	public static void main (String [] args) {
		// —читываю введенные числа и передаю через сеттер
		Scanner scan = new Scanner(System.in);	
		Calculator calculatorOne = new Calculator();	
		System.out.print("Input first number: " + calculatorOne.getFirst());
		calculatorOne.setFirst(scan.nextInt());
		
		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /): " + calculatorOne.getOperator());		
        calculatorOne.setOperator(scan.next().charAt(0));  

        System.out.print("Insert second number: " + calculatorOne.getSecond());
		calculatorOne.setSecond(scan.nextInt());

		System.out.println("–езультаты подсчетов = " + calculatorOne.calculate());

	}
} 