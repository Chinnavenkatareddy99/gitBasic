package scopeOfVariables;

public class Static {
	static int a=3;
	static int b;
	
	
	static {
		System.out.println("block....");
		b=a+10;
		
	}
	
	static void method() {
		System.out.println("static method....");
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Static s=new Static();
	s.a=6;
	s.b=10;
	Static ss=new Static();
	ss.method();
	

}}
