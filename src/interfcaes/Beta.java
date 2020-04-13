package interfcaes;

public interface Beta {
	default void rset() {
		System.out.println("beta reset method......");
	}
	static void show() {
		System.out.println("beta static...");
	}

}
