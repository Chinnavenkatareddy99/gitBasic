package multiThreading;

public class ProrityTest {
public static void main(String[] args) {
	PriorityDemo p=new PriorityDemo();
	Thread t=new Thread(p);
	
	System.out.println(t.getPriority());
	t.setPriority(10);
	System.out.println(t.getPriority());
	t.start();
	System.out.println("main thread....");
}
}
