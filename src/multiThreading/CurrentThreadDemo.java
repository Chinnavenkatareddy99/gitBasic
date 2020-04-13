package multiThreading;

public class CurrentThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println("current thread:"+t);
		t.setName("myOwnThread");
		System.out.println("after name change:"+t);
	//	try {
		for(int n=5;n>0;n--) {
			System.out.println(n);
			Thread.sleep(100);
			
		}
		
	//}
		/*catch(InterruptedException i) {
			i.printStackTrace();
		}*/
	}

}
