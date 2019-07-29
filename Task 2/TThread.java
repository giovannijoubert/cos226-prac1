//Practical assignment 1
//Thread created by extending the Thread class

class TThread extends Thread {
	public void run() {
		for (int i = 0; i < 4; i++) {
		try {
			sleep(400);
		} catch (Exception e) {
			//totally handling it
		}
		int val = ThreadCounterDemo.C.getAndIncrement();
		System.out.println(getName() + " " + val);
		}
	}
}