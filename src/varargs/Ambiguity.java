package varargs;

public class Ambiguity {
	void test(int...x) {
		
	}
	
	void test(boolean...x) {
		
	}
	
	void test(int i,int...x)
			{
		
			}
	
	public static void main(String[] args) {
		Ambiguity a=new Ambiguity();
		//a.test(1,2,3);
		//a.test();
	}
}
