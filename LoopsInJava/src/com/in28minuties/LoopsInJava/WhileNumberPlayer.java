package com.in28minuties.LoopsInJava;

public class WhileNumberPlayer {

	private int limit = 0;

	public WhileNumberPlayer(int i) {
		this.limit = i;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i <= this.limit) {
			System.out.println(Math.pow(i, 2));
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i <= this.limit) {
			System.out.println(Math.pow(i, 3));
			i++;
		}
	}

}
