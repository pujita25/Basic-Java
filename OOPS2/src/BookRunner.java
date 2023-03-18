
public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOP Concepts", "Pujita");
		book.addReview(new Review(10, "Greatbook", 5));
		book.addReview(new Review(101, "Awesome", 5));
		System.out.println(book);
	}

}
