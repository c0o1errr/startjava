import java.util.Scanner;

public class CalculatorTest {	
	public final static Scanner scan = new Scanner(System.in);
	public static void main (String [] args) {
		// I read the entered numbers and pass through the setter
		start();	
		String again = "";	
		do {							
			String repeat = scan.nextLine();			
			if ("yes".equals(repeat)) {
				start();							
			} else { 
				System.out.println("Want to continue ? enter yes/no");
			}
		} while (again == "no");				
	}	

	private static void start() {		
		Calculator calculate = new Calculator();    	
		System.out.print("Input first number: " );
		calculate.setFirst(scan.nextInt());		
		System.out.print("Enter the sign of the matematical operation: (+, -, *, /, ^, % (remainder of the division)): ");
        	calculate.setOperator(scan.next().charAt(0));
        	System.out.print("Insert second number: " );
		calculate.setSecond(scan.nextInt());
		System.out.println("Counting results = " + calculate.calculate());
	}		
}