package exceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		System.out.println(args.length);
		try {
			int a=args.length;
			int b=42/a;
			System.out.println("a:"+a);
			try {
				if(a==1) {
					a=a/(a-a);
				}
				if(a==2) {
					int c[]= {1};
					c[50]=100;
		
				}
			}
		
			catch(ArrayIndexOutOfBoundsException ai) {
				ai.printStackTrace();
			}
				}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}

}
