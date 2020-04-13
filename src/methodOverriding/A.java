package methodOverriding;

public class A {
	int a;
	int b;
	A(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	void show() {
		System.out.println("this is parent a show method......."+a+" "+b);
	}
	
	static void method() {
		System.out.println("parent static");
	}

}
