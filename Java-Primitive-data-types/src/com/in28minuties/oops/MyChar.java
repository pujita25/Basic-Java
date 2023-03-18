package com.in28minuties.oops;

public class MyChar {
	private char ch;

	public MyChar(char str) {
		this.ch = str;
	}

	public boolean isVowel() {
		char lowerCase = Character.toLowerCase(this.ch);
		if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'i') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (this.ch >= 48 && this.ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if ((this.ch >= 97 && this.ch <= 122) || (this.ch >= 65 && this.ch <= 90)) {
			return true;
		}
		return false;
	}

	public void printLowerCaseAlphabet() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(Character.toLowerCase(c));
		}
	}

	public void printUpperCaseAlphabet() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(Character.toUpperCase(c));
		}
	}

	public boolean isConsonant() {
		return isAlphabet() && !isVowel();
	}

}
