import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student1 = new Student("Pujita", 100, 98, 100, 89, 99, 77, 99);
		Student student2 = new Student("Akhil", 97, 98, 100, 98, 99, 67, 99);
		Student student3 = new Student("G", 0, 58, 40, 29, 39, 67, 19);
		int number = student1.getNumberOfMarks();
		System.out.println("Number of Marks: " + number);
		int sum = student1.getSumOfMarks();
		System.out.println("Total Number of Marks: " + sum);
		int maximumMarks = student1.getMaximumMarks();
		System.out.println("Maximum of Marks: " + maximumMarks);
		int minimumMarks = student1.getMinimumMarks();
		System.out.println("Minimum of Marks: " + minimumMarks);
		BigDecimal average = student1.getAverageMarks();
		System.out.println("Average marks: " + average);
		System.out.println(student1);
		student1.addNewMark(89);
		student1.removeMarkAtIndex(4);
	}

}
