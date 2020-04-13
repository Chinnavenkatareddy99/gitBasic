package multiThreading;

public class YieldDemo implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			//Thread.yield();
			System.out.println("chld .....");
		}
		
	}

}
