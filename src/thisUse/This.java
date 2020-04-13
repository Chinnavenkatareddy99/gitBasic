package thisUse;

public class This {
	int i=10;
	int j=12;
	
	void test() {
		this.method();
		int i=15;
		int j=13;
		int k=16;
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(k);
		
	}
	
	void method() {
		System.out.println("normal method...");
	}
	
	static void  abc() {
	
		System.out.println("abc static.....");
		
	}
	static void cdf() {
		System.out.println("static cdf...");
	}
	public static void main(String[] args) {
		This t=new This();
		t.test();
		t.abc();
	
	}

}
