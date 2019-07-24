//Practical assignment 1
//Shared counter object
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	
	int value;
	
	Counter(int c) {
		value = c;
	}
	
	int getAndIncrement() {
		ReentrantLock myLock = new ReentrantLock(); 
		myLock.lock();
		try {
			return value++;
		} finally {
			myLock.unlock();
		}
	}
}