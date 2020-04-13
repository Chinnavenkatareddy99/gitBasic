package multiThreading;

public class DeadLockA {
	synchronized void foo(DeadLockB b) {
		System.out.println("thread 1 starts execution of fooo...");
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException ie){
		}
		System.out.println("ta1 calling b.last");
		b.last();
		}
	
		
	
	
	void last() {
		System.out.println("last in a......");
	}

}
