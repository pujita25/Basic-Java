import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private int count1 = 0;
	private int count2 = 0;

	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();

	public int getCount1() {
		return count1;
	}

	synchronized public void incrementCount1() {
		lock1.lock();
		this.count1++;
		lock1.unlock();
	}

	synchronized public void incrementCount2() {
		lock2.lock();
		this.count2++;
		lock2.unlock();
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
