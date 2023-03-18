package com.in28minutes.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("Pujita"), new CallableTask("Akhil"),
				new CallableTask("TV"));
		String result = executorService.invokeAny(tasks);
		System.out.println(result);
		executorService.shutdown();
	}

}
