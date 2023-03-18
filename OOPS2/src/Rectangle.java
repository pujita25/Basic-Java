
public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getAreaOfRectangle() {
		return this.length * this.width;
	}

	public String toString() {
		return String.format("Length of Reactangle - %d \nWidth of rectangle - %d", this.length, this.width);
	}

	public int getPerimeter() {
		return 2 * (this.length + this.width);
	}
}
