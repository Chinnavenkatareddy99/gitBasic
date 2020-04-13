package superUse;

public class B extends A{
	int i=15;
	int j=20;
	
	void m1() {
		System.out.println("B.M1()");
		System.out.println(super.i);
	}
	
	static void m2() {
		System.out.println("B.m2() static...");
		
	}

}
