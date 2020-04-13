package multiThreading;

public class YieldTest {
	public static void main(String[] args) {
		YieldDemo y=new YieldDemo();
		Thread t=new Thread(y);
		t.start();
		for(int i=5;i>0;i--) {
		//	t.yield();
			System.out.println(" main....");
		}
	}

}
