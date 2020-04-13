package multiThreading;

public class InterThreadDemo {
	public static void main(String[] args) {
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		Thread t=new Thread(p);
		Thread t1=new Thread(p);
		t.start();
		t1.start();
		
	}

}
