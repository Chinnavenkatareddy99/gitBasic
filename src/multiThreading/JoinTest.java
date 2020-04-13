package multiThreading;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		JoinDemo j=new JoinDemo();
		Thread t=new Thread(j);
		t.start();
		t.join();
		System.out.println("main......");
	}

}
