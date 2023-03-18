package com.in28minuties.ifElsePrac;
import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();
		System.out.printf("The number you have entered is: %d", number1).println();
		System.out.println("Enter number2: ");
		int number2 = scanner.nextInt();
		System.out.printf("The number you have entered is: %d", number2).println();
		System.out.println("Choose an operation from the following:");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		int choice = scanner.nextInt();
		System.out.printf("The choosen operation is: %d", choice).println();

		System.out.println("Your Choices are ");
		System.out.printf("Number1: %d", number1).println();
		System.out.printf("Number2: %d", number2).println();
		System.out.printf("Choice: %d", choice).println();
		Menu operation = new Menu();
//		perfOp(number1, number2, choice, operation);
		performOperationsUsingSwitch(number1, number2, choice);

	}

	private static void perfOp(int number1, int number2, int choice, Menu operation) {
		if (choice == 1 || choice == 2 || choice == 3 || choice == 3) {
			System.out.printf("Result: %d", operation.performCalculation(choice, number1, number2));
		} else {
			System.out.println("Invalid choice - cannot perform any operation");
		}
	}

	private static void performOperationsUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1: {
			System.out.println("Result: " + (number1 + number2));
			break;
		}
		case 2: {
			System.out.println("Result: " + (number1 - number2));
			break;
		}
		case 3: {
			System.out.println("Result: " + (number1 / number2));
			break;
		}

		case 4: {
			System.out.println("Result: " + (number1 * number2));
			break;
		}
		default:
			System.out.println("Invalid choice - cannot perform any operation");
		}
	}

}
