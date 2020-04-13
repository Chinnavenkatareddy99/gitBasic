package inheritence;

public class Two extends One{
	
	int l;
	private int m;
	static int p=15;
	
	
	/*public Two(int i, int j, int k, int l, int m) {
		super(i, j, k);
		this.l = l;
		this.m = m;
	}*/
	
	void test() {
		System.out.println("two normal.......");
	}
	
	static void method() {
		System.out.println("two static....");
	}

}
