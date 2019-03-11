import java.util.Scanner;

public class GuessNumber {
	public static final Scanner sc = new Scanner(System.in);
	// Randomly generated computer numbers
	public int randomize() {
		int minRnd = 0; // initial value of the range
		int maxRnd = 100; // range end value
		int random = minRnd+(int)(Math.random()*maxRnd);	

		while (true) {
			System.out.println("The first player enters the number: ");
			int numberPlayerOne = sc.nextInt();		
			System.out.println("The second player enters the number: ");
			int numberPlayerTwo = sc.nextInt();

			if (numberPlayerOne==random) {
				System.out.println("The first player guessed the number !!! Guess number = " + random);
				break;
			}
			if (numberPlayerTwo==random) {
				System.out.println("The second player guessed the number !!! Guess number = " + random);
				break;
			} else {
				System.out.println("Nobody guessed, try again. ");
			} if (numberPlayerOne < random) {
				System.out.println("The number is less than the guess ");
			} if (numberPlayerTwo < random) {
				System.out.println("The number is less than the guess ");
			} if (numberPlayerOne > random) {
				System.out.println("The number is greater than the guess ");
			} if (numberPlayerTwo > random) {
				System.out.println("The number is greater than the guess ");
			}
		}
		return random;	
	}
} 