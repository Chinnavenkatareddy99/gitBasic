package multiThreading;

public class InterruptTest {
public static void main(String[] args) {
	InterruptDemo i=new InterruptDemo();
	Thread t=new Thread(i);
	t.start();
	t.interrupt();
	System.out.println("end of the maain....");
}
}
