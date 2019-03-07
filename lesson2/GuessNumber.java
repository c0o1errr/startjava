import java.util.Scanner;

public class GuessNumber {
	// Генерация случайно числа компьютером
	public int randomize() {
		int minRnd = 0; // начальное значение диапазона
		int maxRnd = 100; // конечное значение диапазона
		int random = minRnd+(int)(Math.random()*maxRnd);

		do {
			if (number.getNumber() > random) {
				System.out.println("The player entered the number more ");
			} else {
				System.out.println("The player entered a number less ");
			}
		} while (number.getNumber() != random);
		System.out.println("You guessed ");
	}
	// Ввод чисел
	public filling() {	
		Scanner sc = new Scanner(System.in);	
		Player numberPlayerOne = new Player();		
		System.out.println("The first player enters the number ");
		int numberPlayerOne = sc.nextInt();	
		playerOne.setNumber(numberPlayerOne);
		Player numberPlayerTwo = new Player();
		System.out.println("The second player enters the number ");
		int numberPlayerTwo = sc.nextInt();
		playerTwo.setNumber(numberPlayerTwo);		
	}
}