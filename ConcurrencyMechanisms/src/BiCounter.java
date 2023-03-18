
public class BiCounter {
	private int count1 = 0;
	private int count2 = 0;

	public int getCount1() {
		return count1;
	}

	synchronized public int incrementCount1() {
		return this.count1++;
	}

	synchronized public int incrementCount2() {
		return this.count2++;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

}
