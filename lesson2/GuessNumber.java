import java.util.Scanner;

public class GuessNumber {
    private int numberPlayerOne;
    private int numberPlayerTwo;

    // Генерация случайно числа компьютером 
    public int randomize() {
    		int minRnd = 0; // начальное значение диапазона
			int maxRnd = 100; // конечное значение диапазона
			int random = minRnd+(int)(Math.random()*maxRnd);
      	System.out.println(numberPlayerOne);
      	System.out.println(numberPlayerTwo);
      	do {
			if (number.getNumber() > random) {
				System.out.println("The player entered the number more ");
			} else {
				System.out.println("The player entered a number less ");
			}
		} while (number.getNumber() != random);
		System.out.println("You guessed ");
        
        return 0;
    }
   // Ввод чисел
    public void filling() {
    		Scanner sc = new Scanner(System.in);
      	numberPlayerOne = sc.nextInt();
      	numberPlayerTwo = sc.nextInt();
    }
}