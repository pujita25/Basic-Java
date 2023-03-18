package com.in28minutes.fp;

import java.util.List;

public class FPNumbersRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

		int sum = printSumBasic(numbers);
		System.out.println("Basic sum - " + sum);
		int sumFP = printSumFP(numbers);
		System.out.println("FP sum - " + sumFP);
		int oddSum = printOddSumFP(numbers);
		System.out.println("ODD sum - " + oddSum);
		int evenSum = printEvenSumFP(numbers);
		System.out.println("Even sum - " + evenSum);
	}

	private static int printEvenSumFP(List<Integer> numbers) {
		int sum = numbers.stream().filter(val -> val % 2 == 0).reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	private static int printOddSumFP(List<Integer> numbers) {
		int sum = numbers.stream().filter(val -> val % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	private static int printSumFP(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	private static int printSumBasic(List<Integer> numbers) {
		int sum = 0;
		for (int numb : numbers) {
			sum += numb;
		}
		return sum;
	}

}
