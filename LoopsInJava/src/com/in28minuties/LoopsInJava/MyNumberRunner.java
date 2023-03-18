package com.in28minuties.LoopsInJava;
public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		System.out.println(number.isPrime());
		
		int sum = number.SumUptoN();
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sum);
		System.out.println(sumOfDivisors);
		number.printANumberTriangle();

	}

}
