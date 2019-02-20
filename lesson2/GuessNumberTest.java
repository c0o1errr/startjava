import java.util.Scanner;

public class GuessNumberTest {
	public static final Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		
		//GuessNumber 

	}			
		// Имена игроков
		private void name() {			
			Player playerOne = new Player();
			Player playerTwo = new Player();
			System.out.println("Введите имя первого игрока ");
			String nameOne = sc.nextLine();
			playerOne.setName(nameOne);			
			System.out.println("Введите имя второго игрока ");
			String nameTwo = sc.nextLine();
			playerTwo.setName(nameTwo);
		}		
		private void number() {			
			Player playerOne = new Player();
			Player playerTwo = new Player();
			System.out.println("Первый игрок вводит число ");
			int numberPlayerOne = sc.nextInt();
			playerOne.setNumber(numberPlayerOne);
			System.out.println("Второй игрок вводит число ");
			int numberPlayerTwo = sc.nextInt();
			playerTwo.setNumber(numberPlayerTwo);
		}
} 