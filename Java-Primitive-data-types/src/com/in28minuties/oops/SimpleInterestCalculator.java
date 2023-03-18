package com.in28minuties.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal interest;
	

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int years) {
		BigDecimal mul = this.principal.multiply(this.interest.multiply(new BigDecimal(years)));
		BigDecimal totalSum = this.principal.add(mul);
		return totalSum;
	}

}
