import java.util.Scanner;

public class GuessNumber {
	public static final Scanner sc = new Scanner(System.in);
	// Генерация случайно числа компьютером
	public int randomize() {
		int minRnd = 0; // начальное значение диапазона
		int maxRnd = 100; // конечное значение диапазона
		int random = minRnd+(int)(Math.random()*maxRnd);

		while (true) {
			Player numberPlayerOne = new Player();
			System.out.println("The first player enters the number: ");
			numberPlayerOne = sc.nextInt();
			Player numberPlayerTwo = new Player();
			System.out.println("The second player enters the number: ");
			numberPlayerTwo = sc.nextInt();

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
	}
}