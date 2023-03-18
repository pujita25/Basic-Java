
public class Counter {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public int increment() {
		return this.count++;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
