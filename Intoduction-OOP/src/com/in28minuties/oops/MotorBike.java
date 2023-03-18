package com.in28minuties.oops;

public class MotorBike {
	// instance variable
	private int speed;

	public MotorBike() {
		this(5);
	}

	public MotorBike(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void started() {
		System.out.println("Bike has started");
	}

	public void increaseSpeed(int speedVal) {
		this.speed += speedVal;
	}

	public void decreaseSpeed(int speedVal) {
		this.speed -= speedVal;
	}
}
