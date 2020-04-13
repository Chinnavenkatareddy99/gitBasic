package interfcaes;

public interface DefaultMethods {
	int getNumber();
	String getName();
	 default String getClear() {
		return "its done......";
	}

}
