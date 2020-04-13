package multiThreading;

public class Consumer implements Runnable {
Q q;

	public Consumer(Q q) {
	super();
	this.q = q;
}

	@Override
	public void run() {
		while(true) {
			q.get();
		}
		
	}

}
