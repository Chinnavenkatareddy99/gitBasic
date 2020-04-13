package methodoverloading;

public class AutomaticConversion {
	 void test() {
		System.out.println("no args");
	}
	void test(int i,int j) {
		System.out.println("2 integer args");
	}
	void test(double d) {
		System.out.println("1 double args");
	}
	
	public static void main(String[] args) {
		AutomaticConversion a=new AutomaticConversion();
		a.test(10);
	}
	
	

}
