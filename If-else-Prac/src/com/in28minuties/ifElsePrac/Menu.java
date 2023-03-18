package com.in28minuties.ifElsePrac;

public class Menu {

	public int performCalculation(int choice, int number1, int number2) {
		int finalNumber = 0;
		if (choice == 1)
			finalNumber = number1 + number2;
		if (choice == 2)
			finalNumber = number1 - number2;
		if (choice == 3)
			finalNumber = number1 / number2;
		if (choice == 4)
			finalNumber = number1 * number2;
		return finalNumber;
	}

}
