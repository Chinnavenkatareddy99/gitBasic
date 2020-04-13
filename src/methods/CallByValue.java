package methods;

public class CallByValue {
	
	
	
	void math(int a,int b) {
		a+=5;
		b-=1;
	}
	
	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		int a=10;
		int b=10;
		System.out.println("before:"+a+" "+b);
		c.math(a, b);
		
		System.out.println("after:"+a+" "+b);
	}

}
