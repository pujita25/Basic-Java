package com.in28minutes.fp;

import java.util.List;

public class FuntionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
//		printListFP(list);
//		printListEndingWithAtFP(list);
		List<Integer> numbers = List.of(1, 4, 7, 9, 11);
		printOddNumbersFP(numbers);
		System.out.println("----------------------------");
		printEvenNumbersFP(numbers);

	}

	private static void printOddNumbersFP(List<Integer> numbers) {
		numbers.stream().filter(val -> val % 2 != 0).forEach(val -> System.out.println("ODD Numbers - " + val));
	}

	private static void printEvenNumbersFP(List<Integer> numbers) {
		numbers.stream().filter(val -> val % 2 == 0).forEach(val -> System.out.println("EVEN Numbers - " + val));
	}

	private static void printListBasic(List<String> list) {
		for (String val : list) {
			System.out.println(val);
		}
	}

	private static void printListEndingWithAtBasic(List<String> list) {
		for (String val : list) {
			if (val.endsWith("at")) {
				System.out.println(val);
			}

		}
	}

	private static void printListEndingWithAtFP(List<String> list) {
		list.stream().filter(val -> val.endsWith("at")).forEach(val -> System.out.println("Element - " + val));
	}

	private static void printListFP(List<String> list) {
		list.forEach(val -> System.out.println("Element - " + val));
	}
}
