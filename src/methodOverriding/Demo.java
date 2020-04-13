package methodOverriding;

public class Demo {
	public static void main(String[] args) {
		B b=new B(10, 20, 30, 40);
		b.show();
		b.method();
		A a=new A(10,20);
		a.method();
		a.show();
		
		  A aa=new B(10,20,52,96);
		aa.method();
			
		
	}

}
