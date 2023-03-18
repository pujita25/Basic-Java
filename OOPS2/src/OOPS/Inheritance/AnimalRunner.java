package OOPS.Inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };
		for (Animal obj : animals) {
			obj.bark();
		}

	}

}
