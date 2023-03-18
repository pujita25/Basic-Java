package com.in28minutes.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number = 0;

	public Task(int i) {
		this.number = i;
	}

	public void run() {
		System.out.println("\nTask " + this.number + "has started\n");
		for (int i = number * 100; i <= number * 100 + 99; i++)
			System.out.print(i + " ");
		System.out.println("\nTask" + this.number + "completed\n");
	}
}

public class ExecutorServiceRunner2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));

		executorService.shutdown();
	}

}
