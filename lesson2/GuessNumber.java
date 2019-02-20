public class GuessNumber {
	// Генерация случайно числа компьютером
	public int randomize() {
		int a = 0; // начальное значение диапозона
		int b = 100; // конечное значение диапозона
		int random = a+(int)(Math.random()*b);
		
		do {
			if (number > random) {
				System.out.println("Игрок ввел число больше ");
			} esle {
				System.out.println("Игрок ввел число меньше ");
			}

		} while (number != random)
	}
}