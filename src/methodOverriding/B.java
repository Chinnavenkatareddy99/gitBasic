package methodOverriding;

public class B extends A {
	int c;
	int d;
	public B(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}
	
	 void show() {
	
		System.out.println("overriden....."+c+" "+d);
	}
	static void method() {
		
		System.out.println("child static...");
	}
	
	/*static void method(int x) {
		
	}*/

}
