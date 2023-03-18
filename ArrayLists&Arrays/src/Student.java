import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

;

public class Student {
	private String name = "";
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return this.marks.size();
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : this.marks) {
			sum += mark;
		}
		return sum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getSumOfMarks();
		int length = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(length), 3, RoundingMode.UP);
	}

	public int getMaximumMarks() {
		return Collections.max(this.marks);
	}

	public int getMinimumMarks() {
		return Collections.min(this.marks);
	}

	public String toString() {
		return this.name + this.marks;
	}

	public void addNewMark(int newMark) {
		this.marks.add(newMark);
		System.out.println("Marks: " + this.marks);
	}

	public void removeMarkAtIndex(int i) {
		this.marks.remove(i);
		System.out.println("Marks after removed: " + this.marks);
	}

}
