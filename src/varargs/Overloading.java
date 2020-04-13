package varargs;

public class Overloading {
	void test(int...x) {
		for(int v:x) {
			System.out.println(v);
		}
		
	}
	
	void test(double...x) {
		for(double v:x) {
			System.out.println(v);
		}
		
	}
	void test(String s,int...x) {
		for(int v:x) {
			System.out.println(s+v);
		}
		
	}
	
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.test(10,10,30);
		o.test(10.5,10.6,10.9);
		o.test("test",10,10,20);
		
	}
}
