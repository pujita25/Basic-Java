import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithLock {
	private AtomicInteger count1 = new AtomicInteger();
	private AtomicInteger count2 = new AtomicInteger();

	public int getCount1() {
		return count1.get();
	}

	synchronized public void incrementCount1() {
		count1.incrementAndGet();
	}

	synchronized public void incrementCount2() {
		count2.incrementAndGet();
	}

	public int getCount2() {
		return count2.get();
	}

}
