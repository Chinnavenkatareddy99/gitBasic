package multiThreading;

public class DeadLockB {
	synchronized void bar(DeadLockA a) {
		System.out.println("thread 2 starts execution of bar");
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException ie) {
			
		}
		System.out.println("t2 calling a.last");
		a.last(); 
		
	}
		void last() {
			System.out.println("last in b...");
		}
}
