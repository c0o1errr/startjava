package com.startjava.lesson_1.game;

public class GuessNumber {
    public static void main (String [] args) {
        int playerNumber = 220;
        int computerNumber = 214;

        while (playerNumber != computerNumber) {
            if (playerNumber > computerNumber) {
                playerNumber--;   
                System.out.println(" Number more " + playerNumber);                               
            } else if  (playerNumber < computerNumber) {
                playerNumber++;
                System.out.println(" Number less " + playerNumber);
            }           
            
        }
        System.out.println(" Right! Guessed number = " + computerNumber);
    }
}