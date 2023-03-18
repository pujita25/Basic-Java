import java.util.ArrayList;

public class Book {

	private int id;
	private String bookName;
	private String authorName;
	private ArrayList<Review> review = new ArrayList<Review>();

	public Book(int id, String bookName, String authorName) {
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	public String toString() {
		return String.format("Id - %d\nBook Name - %s\nAuthor Name - %s\nReview - %s", id, bookName, authorName,
				review);
	}

}
