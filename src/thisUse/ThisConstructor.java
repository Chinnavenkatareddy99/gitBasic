package thisUse;

public class ThisConstructor {
	public ThisConstructor() {
		this("chinna");
		System.out.println("zero....");
		
	}
public ThisConstructor(int x) {
	System.out.println("int....");
		
	}
public ThisConstructor(String s) {
	this(22);
	System.out.println("string ......");
	
}
	public static void main(String[] args) {
		ThisConstructor t= new ThisConstructor();
	}

}
