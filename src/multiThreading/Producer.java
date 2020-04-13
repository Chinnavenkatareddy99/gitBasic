package multiThreading;

public class Producer implements Runnable{
Q q;


public Producer(Q q) {
	super();
	this.q = q;
}


@Override
public void run() {
	int i=0;
while(true) {
	q.put(i++);
}
}

}
