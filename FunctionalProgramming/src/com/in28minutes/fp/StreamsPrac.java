package com.in28minutes.fp;

import java.util.List;

public class StreamsPrac {

	public static void main(String[] args) {
		List<String> words = List.of("Ant", "Bat", "Apple");
		words.stream().map(val -> val.toLowerCase()).forEach(ele -> System.out.println(ele));
		words.stream().map(val -> val.length()).forEach(ele -> System.out.println(ele));
	}

}
