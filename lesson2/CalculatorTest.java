import java.util.Scanner;

public class CalCulatorTest {
	
	public static void main (String [] args) {
		// Считываю введенные числа и передаю через сеттер
		Scanner scan = new Scanner(System.in);	
		Calculator firstNumber = new Calculator();	
		System.out.print("Inser first number: ");
		firstNumber.setFirst(int firstNumber = scan.nextInt());
		
		Calculator mathOperator = new Calculator();		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /): ");		
        mathOperator.setOperator(char mathOperator = scan.next().charAt(0));  

        Calculator secondNumber = new Calculator();      
        System.out.print("Insert second number: ");
		secondNumber.setSecond(int secondNumber = scan.nextInt());	

		Calculator finish = new Calculator();
		System.out.println("Result = " + finish.calculate());

	}
} 