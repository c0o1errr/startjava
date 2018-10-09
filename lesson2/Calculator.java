public class Calculator {

	int first; 
	int second;
	
	
	int calculating() {

		switch(operator) {

			case '+':
			result = first + second;
			break;

			case '-':
			result = first - second;
			break;

			case '*':
			result = first * second;
			break;

			case '/':
			result = first * second;
			break;

			case'^':
				int result = 1;
				for (int i = 0; i < second; i++) {
				result *= first;
			}
			break;

			return result;
		}
	}	
}