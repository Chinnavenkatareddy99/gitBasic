package lamdaExpressions;

public class MethodRefDEmo {
	static void method() {
		System.out.println("child......");
	}
public static void main(String[] args) {
		Runnable r=MethodRefDEmo::method;
		Thread t=new Thread(r);
		t.start();
		
		
	
}
}
