package com.startjava.lesson_2_3.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;


	public Jaeger(String modelName, String mark, String origin, float height, float weight) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;

	}

	
	public boolean drift() {
		System.out.println("You entered the drift " );
		return true;
	}

	public String scanKaiju() {
		return "nothing";
	}

	public void useWeapon() {
		System.out.println("FIREEEEEEEEEE!");
	}

	public void move() {
		System.out.println("You have completed 5 steps" );
	}

	public void useVortex() {
	}

	public String toString() {
		return "modelName = " + modelName + "mark = " + mark;
	}
}