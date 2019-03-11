import java.util.Scanner;

public class GuessNumberTest {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Before you game GUESS NUMBER !!! ");
		System.out.println("Two players are playing. ");
		System.out.println("You need to enter a number from 1 to 100, who first guessed the one and won. ");
		System.out.println("First, enter player names. ");
		naming();
		GuessNumber start = new GuessNumber();
		start.randomize();		
	}			
		// Имена игроков
	private static void naming() {		
		System.out.println("Enter the first players name ");
		Player playerOne = new Player(sc.nextLine());				
		System.out.println("Enter the second players name ");
		Player playerTwo = new Player(sc.nextLine());
	}			
} 