import java.util.Scanner;

public class CalCulatorTest {
	
	public static void main (String [] args) {

		Scanner reader = new Scanner(System.in);
   		 System.out.println("Введите первое число: " + first);
   		 System.out.println("Введите второе число: " + second);

    	int first = k.nextInt();
    	int second = k.nextInt();

    	System.out.print("Введите знак математической операции: (+, -, *, /): " + operator);
        char operator = reader.next().charAt(0);

		Calculator operationOne = new Calculator();
		
		operationOne.calculating();
		//System.out.println("Результат = " + operationOne.calculating());

		
	}
} 