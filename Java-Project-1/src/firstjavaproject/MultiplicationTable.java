package firstjavaproject;

public class MultiplicationTable {
	void printTable(int value) {
		for (int i = 0; i<=10; i++) {
			System.out.printf("%d * %d = %d \n", value, i, value * i);
		}
	}
}
