package exceptionHandling;

public class ExceptionDemo1 {

	public static void doStuff() {
		doMore();

	}

	public static void doMore() {
		try {
		System.out.println(10 / 0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae);
			System.out.println(ae.getMessage());
			System.out.println("inside catch block......");
		}
	}

	public static void main(String[] args)  {
		doStuff();
		System.out.println("after the method...");

	}

}
