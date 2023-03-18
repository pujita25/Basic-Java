package OOPS.Inheritance;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Prepare the ingredients");

	}

	@Override
	void makeTheDish() {
		System.out.println("Prepare the dish");

	}

	@Override
	void cleanUp() {
		System.out.println("Clean all the utensils");

	}

}
