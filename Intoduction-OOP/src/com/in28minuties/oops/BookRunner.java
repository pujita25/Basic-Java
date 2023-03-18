package com.in28minuties.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(10);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.setNoOfCopies(20);
		System.out.println(effectiveJava.getNoOfCopies());
		cleanCode.setNoOfCopies(30);
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.increaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.increaseNoOfCopies(100);
		System.out.println(effectiveJava.getNoOfCopies());
		cleanCode.increaseNoOfCopies(100);
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.decreaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		effectiveJava.decreaseNoOfCopies(100);
		System.out.println(effectiveJava.getNoOfCopies());
		cleanCode.decreaseNoOfCopies(100);
		System.out.println(cleanCode.getNoOfCopies());
	}

}
