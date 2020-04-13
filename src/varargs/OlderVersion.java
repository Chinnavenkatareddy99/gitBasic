package varargs;

public class OlderVersion {
	
	public void test(int v[]) {
		System.out.println("lenthg of the array:"+v.length);
		for(int x:v) {
			System.out.print(x+" ");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		OlderVersion o=new OlderVersion();
		int n1[]= {10,20,30};
		int n2[]= {1,2,3,5,5,6,4};
		
		o.test(n1);
		o.test(n2);
	}

}
