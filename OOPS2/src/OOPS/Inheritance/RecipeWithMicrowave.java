package OOPS.Inheritance;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Prepare the ingredients");
		System.out.println("Switch on the Microwave");

	}

	@Override
	void makeTheDish() {
		System.out.println("Prepare the dish");
		System.out.println("Put it inside the microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean the utensils");
		System.out.println("Switch off the Microwave");
	}

}
