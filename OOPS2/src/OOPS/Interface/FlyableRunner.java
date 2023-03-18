package OOPS.Interface;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable obj : flyingObjects) {
			obj.fly();
		}
	}

}
