package OOPS.Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Pujita", "SUNY Binghamton");
		student.setEmail("pujitabodapati@gmail.com");
		student.setCollegeName("SUNY Binghamton");
		student.setYear(2023);
		System.out.println(student);
	}

}
