package multiThreading;

public class SysDemo implements Runnable{
	String name;
	SysDisplay d;
	
	

	public SysDemo(String name, SysDisplay d) {
		super();
		this.name = name;
		this.d = d;
	}



	@Override
	public void run() {
		synchronized(d) {
		d.display(name);
		}
		
	}
	

}
 