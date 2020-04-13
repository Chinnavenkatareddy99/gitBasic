package exceptionHandling;

public class ChainedException {
	static void outer() {
		NullPointerException n=new NullPointerException("top layer....");
		n.initCause(new ArithmeticException("original cause"));
		throw n;
		
	}
	public static void main(String[] args) {
		try {
			outer();
		}
		catch(NullPointerException n) {  
			// n.printStackTrace();b 
			System.out.println("orginal reason:"+n.getCause());
			
		}
	}

}
