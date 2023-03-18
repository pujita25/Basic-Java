package OOPS.Inheritance;

public class EmployeeRunner {
	public static void main(String[] args) {
		Employee employee = new Employee("Pujita", "Full Stack Developer");
		employee.setTitle("Full Stack Developer");
		employee.setEmployeeGrade("L2");
		employee.setSalary(12456);
		employee.setEmployer("Tech Talent Connect");
		System.out.println(employee);
	}
}
