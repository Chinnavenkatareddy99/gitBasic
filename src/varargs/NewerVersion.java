package varargs;

public class NewerVersion {
	void test(int...v) {
		System.out.println("lenthg of the arguments:"+v.length+" contents are:");
		for(int x:v) {
			System.out.print(x+" ");
		}
		
	}
	public static void main(String[] args) {
		NewerVersion n=new NewerVersion();
		n.test();
		n.test(10,20,30,40);
		
		
	}

}
