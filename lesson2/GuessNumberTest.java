import java.util.Scanner;

public class GuessNumberTest {
	public static final Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		
		//GuessNumber 

	}			
		// ����� �������
		private void name() {			
			Player playerOne = new Player();
			Player playerTwo = new Player();
			System.out.println("������� ��� ������� ������ ");
			String nameOne = sc.nextLine();
			playerOne.setName(nameOne);			
			System.out.println("������� ��� ������� ������ ");
			String nameTwo = sc.nextLine();
			playerTwo.setName(nameTwo);
		}		
		private void number() {			
			Player playerOne = new Player();
			Player playerTwo = new Player();
			System.out.println("������ ����� ������ ����� ");
			int numberPlayerOne = sc.nextInt();
			playerOne.setNumber(numberPlayerOne);
			System.out.println("������ ����� ������ ����� ");
			int numberPlayerTwo = sc.nextInt();
			playerTwo.setNumber(numberPlayerTwo);
		}
} 