package com.in28minuties.LoopsInJava;

public class MyNumber {
	private int number = 0;

	public MyNumber(int i) {
		this.number = i;
	}

	public boolean isPrime() {
		int count = 0;
		for (int i = 1; i <= this.number; i++) {
			if (this.number % i == 0) {
				count++;
			}
		}
		return count > 2 ? false : true;
	}

	public int SumUptoN() {
		int count = 0;
		for (int i = 1; i <= this.number; i++) {
			count++;
		}
		return count;
	}

	public int sumOfDivisors() {
		int count = 0;
		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				count++;
			}
		}
		return count;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= this.number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

}
