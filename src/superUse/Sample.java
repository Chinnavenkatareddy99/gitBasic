package superUse;

public class Sample extends B{
	int i=25;
	int j=30;

	void m1() {
		
		System.out.println("sample m1....");
		System.out.println(super.i);
		super.m1();
		
		
	}
	static void m2() {
	
		System.out.println("sample static m2()");
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		s.m1();
		
	}

}
