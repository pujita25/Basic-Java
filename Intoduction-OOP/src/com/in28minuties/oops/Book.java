package com.in28minuties.oops;

public class Book {
	private int noOfCopies;

	public Book(int copies) {
		this.noOfCopies = copies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return this.noOfCopies;
	}

	public void increaseNoOfCopies(int numb) {
		this.noOfCopies += numb;
	}

	public void decreaseNoOfCopies(int numb) {
		this.noOfCopies -= numb;
	}
}
