package methods;

public class CallByReference {
	int a;
	int b;
	public CallByReference(int a, int b) {
	
		this.a = a;
		this.b = b;
	}
	
	void test(CallByReference c) {
		c.a+=5;
		c.b-=1;
		
	}
	
	public static void main(String[] args) {
		CallByReference c=new CallByReference(10, 10);
		System.out.println(c.a+" "+c.b);
		c.test(c);
		System.out.println(c.a+" "+c.b);
		
	}
}
