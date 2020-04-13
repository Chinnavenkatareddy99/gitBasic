package interfcaes;

public interface Alpha {
	default void rset() {
		System.out.println("Alpha reset method......");
	}
	
	static void show() {
		System.out.println("static method....");
	}

}
