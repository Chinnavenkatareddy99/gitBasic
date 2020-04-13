package exceptionHandling;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Random r= new Random();
		for(int i=0;i<100;i++) {
			try {
			b=r.nextInt();
			c=r.nextInt();
			a=222/(b/c);
			}
			catch(ArithmeticException ae) {
				ae.printStackTrace();
				System.out.println("i:"+i);
				a=0;
			}
			
		}
		System.out.println("a:"+a);
	}

}
