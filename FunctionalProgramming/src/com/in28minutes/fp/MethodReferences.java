package com.in28minutes.fp;

import java.util.List;

public class MethodReferences {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean filterValues(Integer number) {
		return number % 2 == 0;
	}

	public static int maxValue(Integer number1, Integer number2) {
		return Integer.compare(number1, number2);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Caterpillar", "Elephant").stream().map(String::length)
				.forEach(MethodReferences::print);

		Integer max = List.of(12, 32, 43, 54, 65, 76, 87, 98, 11).stream().filter(MethodReferences::filterValues)
				.max(MethodReferences::maxValue).orElse(0);
		System.out.println(max);
	}

}
