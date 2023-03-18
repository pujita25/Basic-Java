package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicateList(X list) {
		list.addAll(list);
	}

	static double sumOfNumbers(List<? extends Number> list) {
		double sum = 0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		String val = doubleValue("Bisket");
		System.out.println(val);

		long numb = doubleValue(111111111111111111l);
		System.out.println(numb);
		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4, 5, 6)));
		System.out.println(sumOfNumbers(List.of(1l, 2l, 3l, 4l, 5l, 6l)));
		System.out.println(sumOfNumbers(List.of(1.1, 2.2, 3.3, 4.0, 5.0, 6.0)));
		ArrayList<Integer> listVals = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		duplicateList(listVals);
		System.out.println(listVals);

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);
		System.out.println("LIST Type STRING: " + list);
		System.out.println("String value: " + value);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(10));
		list2.addElement(2);
		int number = list2.get(1);
		System.out.println("LIST Type INTEGER: " + list2);
		System.out.println("Integer value: " + number);
	}

}
