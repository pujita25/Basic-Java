package com.in28minutes.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void addAmount(Amount that) throws CurrienciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			throw new CurrienciesDoNotMatchException("Currencies dont match");
		}
		this.amount += that.amount;
	}

	public String toString() {
		return currency + " " + amount;
	}
}

class CurrienciesDoNotMatchException extends Exception {
	public CurrienciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrienciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.addAmount(amount2);
		System.out.println(amount1);
	}

}
