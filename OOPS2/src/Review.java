
public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	public String toString() {
		return String.format("ID - %d\nDescription - %s\nRating - %d", id, description, rating);
	}

}
