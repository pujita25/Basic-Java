import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentCollections implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentsRunner {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>(List.of(new Student(12, "Astha"), new Student(22, "Shlok"),
				new Student(3, "Arnav"), new Student(4, "kushi")));
		System.out.println(student);
		Collections.sort(student);
		System.out.println(student);

//		Collections.sort(student, new DescendingStudentCollections());
		student.sort(new DescendingStudentCollections());
		System.out.println("DSC" + student);
	}

}
