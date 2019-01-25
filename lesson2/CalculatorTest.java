import java.util.Scanner;

public class CalculatorTest {
	
	public static void main (String [] args) {
		// I read the entered numbers and pass through the setter

		Scanner scan = new Scanner(System.in);
		Start();
		while (true) {
						
			System.out.println("Want to continue ? enter yes/no" );
			String again = scan.nextLine();

			if ("yes".equals(again)) {
				Start();
			} else if ("no".equals(again)) {
				break;
			} else {
				System.out.println("Want to continue ? enter yes/no" );
			}
		}
	}	

	private static void Start() {
		Scanner scnr = new Scanner(System.in);
		Calculator counts = new Calculator();
    	
		System.out.print("Input first number: " );
		counts.setFirst(scnr.nextInt());	
		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /, ^, % (остаток от деления)): ");
        counts.setOperator(scnr.next().charAt(0));

        System.out.print("Insert second number: " );
		counts.setSecond(scnr.nextInt());

		System.out.println("Counting results = " + counts.calculate());
	}	
}