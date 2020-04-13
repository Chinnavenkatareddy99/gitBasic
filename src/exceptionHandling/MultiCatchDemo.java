package exceptionHandling;

public class MultiCatchDemo {
	public static void main(String[] args) {
		try {
		
		
		int b=10/0;
		int c[]= {1};
		c[50]=100;
		
		}
	
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("arithmatic ..");
			System.exit(0);
		}
	 
		
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("arrayindex....");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("finally excetuted");
			
		}
		
		System.out.println("after try catch,......../");
		
	}

}
