package exceptionHandling;

public class ThrowDemo {
	static void doStuff() {
		try {
			throw new NullPointerException();
		
		}
		catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("inside method ...");
			throw n;
		}
	}
	public static void main(String[] args) {
		try {
			doStuff();
		}
		catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("outer....");
		}
	}

}
