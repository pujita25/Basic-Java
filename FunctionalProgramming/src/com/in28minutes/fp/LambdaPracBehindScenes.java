package com.in28minutes.fp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}

class NumberSquare implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t * t;
	}

}

class PrintConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);

	}

}

public class LambdaPracBehindScenes {

	public static void main(String[] args) {
		List.of(12, 32, 43, 54, 65, 76, 87, 98, 11).stream().filter(new EvenNumberPredicate())
				.map(new NumberSquare())
				.forEach(new PrintConsumer());


	}

}
