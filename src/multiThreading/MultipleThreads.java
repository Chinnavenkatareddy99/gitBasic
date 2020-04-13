package multiThreading;

public class MultipleThreads implements Runnable {
	String name;
	Thread t;
	
	MultipleThreads(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("new thread:"+t);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("thi is child of run");
		System.out.println("existing the thread:"+name);
		
	}

}
