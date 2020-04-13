package multiThreading;

public class RunnableTest {
	public static void main(String[] args) {
		RunnableDemo r=new RunnableDemo();
		//Thread t=new Thread();
		Thread t=new Thread(r);
		t.start();
		
		System.out.println("main thread....");
	}

}
