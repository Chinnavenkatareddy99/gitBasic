package multiThreading;

public class SysTest {
	public static void main(String[] args) {
		SysDisplay d=new SysDisplay();
		SysDemo s=new SysDemo("dhoni",d);
		SysDemo s1=new SysDemo("kohli",d);
		Thread t=new Thread(s);
		Thread t1=new Thread(s1);
		t.start();
		t1.start();
	}

}
