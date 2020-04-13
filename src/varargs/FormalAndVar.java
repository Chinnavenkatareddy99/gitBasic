package varargs;

public class FormalAndVar {
	void test(String s,int...v) {
		System.out.print(s+" lenthg: "+v.length+" contents are:");
		for(int x:v) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		FormalAndVar f=new FormalAndVar();
		f.test("hii", 1,2,2,2);
	}

}
