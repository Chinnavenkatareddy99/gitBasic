package multiThreading;

public class InterruptDemo  implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("im child thread.....:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i) {
		System.out.println("i got interrupted");
		}
	}

}
