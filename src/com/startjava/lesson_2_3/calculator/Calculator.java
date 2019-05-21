package com.startjava.lesson_2_3.calculator;

public class Calculator {	
	private int first; 
	private int second;
	private int result;
	private char operator;	

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {	
		this.first = first;		
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {		
		this.second = second;		
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
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
		case '/':	result = first / second;
				break;
		case '%':   result = first % second;
				break;
		case '^':	result = (int)Math.pow(first, second);
				break;																
		}	
		return result;	
	}	
	
}