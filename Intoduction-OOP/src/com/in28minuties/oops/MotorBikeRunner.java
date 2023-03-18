package com.in28minuties.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike honda = new MotorBike(100);
		MotorBike ducati = new MotorBike(50);
		MotorBike suzuki = new MotorBike();
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());
		System.out.println(suzuki.getSpeed());
		honda.started();
		ducati.started();

		honda.setSpeed(100);
		ducati.setSpeed(50);

		honda.increaseSpeed(20);
		ducati.increaseSpeed(50);
		honda.decreaseSpeed(20);
		ducati.decreaseSpeed(50);
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());
	}

}
