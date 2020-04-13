package methodoverloading;

public class Basic {
	void test() {
		System.out.println("no arguments");
	}
	
	void test(int i) {
		System.out.println("integer arguments");
		
	}
	
	void test(String s) {
		System.out.println("string arguments");
	}

	  int  test(int i,int j) {
		System.out.println("two int....");
		return i*j;
	}
	 
	
	void test(double d) {
		System.out.println("double....");
	}
	public static void main(String[] args) {
		Basic b=new Basic();
		b.test();
		b.test(10);
		b.test("chinna");
		int t = b.test(10,10);
		b.test(10.5);
		b.test(t);
		
		
	}
	
}
