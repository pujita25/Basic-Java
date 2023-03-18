package com.in28minuties.LoopsInJava;

import java.util.Scanner;

public class DoWhileRepeatedQues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberInp = 0;
		do {
			System.out.println("Cube of input is" + Math.pow(numberInp, 3));
			System.out.println("Enter a number");
			numberInp = scanner.nextInt();
		} while (numberInp > 0);
		System.out.println("Thank you! have fun");
	}

}
