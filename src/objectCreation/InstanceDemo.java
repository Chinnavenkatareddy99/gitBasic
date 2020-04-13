package objectCreation;

public class InstanceDemo {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("objectCreation.UsingInstance").newInstance();
	}

}
