package firstjavaproject;

public class MtableWInstance {
	void printTable(int value, int start, int end) {
		for (int i = start; i<=end; i++) {
			System.out.printf("%d * %d = %d \n", value, i, value * i);
		}
	}
	public static void main(String[] args) {
		MtableWInstance table = new MtableWInstance();
		table.printTable(5, 10, 20);

		table.printTable(6, 1, 20);
	}

}
