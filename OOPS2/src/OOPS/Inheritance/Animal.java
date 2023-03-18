package OOPS.Inheritance;

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Bow Bow");

	}

}

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("Meow Meow");

	}

}

public abstract class Animal {
	abstract void bark();
}
