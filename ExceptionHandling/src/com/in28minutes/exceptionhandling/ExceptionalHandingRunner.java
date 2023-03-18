package com.in28minutes.exceptionhandling;

public class ExceptionalHandingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");

	}

	private static void method1() {
		method2();
		System.out.println("Method 1 ended");
	}

	private static void method2() {
		try {
//			String str = null;
//			str.length();
			int[] numbers = { 1, 2, 3 };
			int val = numbers[5];
			System.out.println(val);
			System.out.println("Method 2 ended");
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer exception");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exp) {
			System.out.println("ArrayIndexOutOfBoundsException");
			exp.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
