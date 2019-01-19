public class Calculator {

	private int first; 
	private int second;
	private double result;
	private char operator;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		if (first == 0) {
			System.out.println("Result = 0");
		}else{
			this.first = first;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second == 0){
			System.out.println("Result = 0");
		}else{
			this.second = second;
		}
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public int calculate() {

			switch(operator) {

			case '+':	result = first + second;
						break;
			case '-':	result = first - second;
						break;
			case '*':	result = first * second;
						break;
			case '/':	result = first * second;
						break;
			case '^':	int result = 1;
						for (int i = 0; i < second; i++) {
						result *= first;
			}
			break;	
			return result;		
		}
	}	
}