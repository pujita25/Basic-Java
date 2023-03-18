package com.in28minuties.oops;

public class BiNumber {
	private int value1;
	private int value2;

	public BiNumber(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int add() {
		return this.value1 + this.value2;
	}

	public int multiply() {
		return this.value1 * this.value2;
	}

	public void doubleValue() {
		this.value1 *= 2;
		this.value2 *= 2;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

}
