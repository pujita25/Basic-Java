
public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		int area = rectangle.getAreaOfRectangle();
		System.out.println("Area of Rectangle: " + area);
		System.out.println(rectangle);
		int perimeter = rectangle.getPerimeter();
		System.out.println("Perimeter: " + perimeter);
	}

}
