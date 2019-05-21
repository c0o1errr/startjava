package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Before you game GUESS NUMBER !!! ");
		System.out.println("Two players are playing. ");
		System.out.println("You need to enter a number from 1 to 100, who first guessed the one and won. ");
		System.out.println("First, enter player names. ");		
		GuessNumber start = new GuessNumber();
		

		do {			
			start.guess();
			String again = sc.nextLine();
			if ("no".equals(again)) {
				break;				
			} 
		} while (true);		
				
	}			
		//Player names
	private static void name() {		
		System.out.println("Enter the first players name ");
		String nameOne = sc.nextLine();
		Player playerOne = new Player(nameOne);				
		System.out.println("Enter the second players name ");
		String nameTwo = sc.nextLine();
		Player playerTwo = new Player(nameTwo);
	}			
} 