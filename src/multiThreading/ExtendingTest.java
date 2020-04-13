package multiThreading;

public class ExtendingTest {
	public static void main(String[] args) {
		ExtendindDemo e=new ExtendindDemo();
		Thread t=new Thread(e);
		t.start();
		System.out.println("main...");
	}

}
