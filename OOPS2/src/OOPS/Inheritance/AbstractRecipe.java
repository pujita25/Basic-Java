package OOPS.Inheritance;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		makeTheDish();
		cleanUp();
	}

	abstract void getReady();

	abstract void makeTheDish();

	abstract void cleanUp();

}
