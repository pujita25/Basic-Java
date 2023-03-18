package com.in28minutes.multithreading;

class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 Started\n");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");
		System.out.println("Task1 done\n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Started\n");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		System.out.println("Task2 done\n");

	}

}

public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		System.out.println("Task1 Kicked off\n");
		Task1 task1 = new Task1();
		task1.setPriority(3);
		task1.start();
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		task1.join();
		task2Thread.join();
		// Task3
		System.out.println("Task3 Kicked off\n");
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");
		System.out.println("Task3 done\n");
		System.out.println("Main done");
	}

}
