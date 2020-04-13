package multiThreading;

public class DeadLock implements Runnable{
	DeadLockA a=new DeadLockA();
	DeadLockB b=new DeadLockB();

	@Override
	public void run() {
		b.bar(a);
		
	}
	DeadLock(){
		Thread t=new Thread(this);
		t.start();
		a.foo(b);
		
	}

	public static void main(String[] args) {
		
				new  DeadLock();
		
	
	}
}
