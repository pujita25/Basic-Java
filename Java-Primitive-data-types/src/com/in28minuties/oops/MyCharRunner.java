package com.in28minuties.oops;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		myChar.printLowerCaseAlphabet();
		myChar.printUpperCaseAlphabet();
	}

}
