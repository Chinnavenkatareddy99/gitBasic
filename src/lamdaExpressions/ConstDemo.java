package lamdaExpressions;

public class ConstDemo {
	public static void main(String[] args) {
		ConInter c=Sample::new;
		Sample s1 = c.method();
		Sample s2 = c.method();
	}

}
