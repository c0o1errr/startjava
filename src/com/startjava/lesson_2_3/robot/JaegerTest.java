package com.startjava.lesson_2_3.robot;
import java.util.Scanner; 

public class JaegerTest {
	public static void main (String [] args) {
		Jaeger gipsyAvenger = new Jaeger ( "GipsyAvenger", "Mark-6", "Pan Pacifice Defense Corps", 81.8f, 2.004f);				
		Jaeger gipsyDanger = new Jaeger ("Gipsy Danger", "Mark-3", "USA", 79.2f, 1.98f);

		System.out.println(gipsyAvenger);
		System.out.println(gipsyDanger);

		gipsyDanger.drift();
		System.out.println(gipsyAvenger.scanKaiju());
		gipsyDanger.useWeapon();
		gipsyAvenger.move();
		
		System.out.println(gipsyDanger.toString());
	}
}