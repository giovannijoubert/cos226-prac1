//Practical assignment 1
//Two threads can access a shared Counter

class ThreadCounterDemo {
	public static Counter C = new Counter(1);
	public static void main (String args[]) {
		
		TThread t1 = new TThread();
		t1.start();
		 
		TThread t2 = new TThread();
		t2.start();
	}
}