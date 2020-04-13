package strings;

public class ImmutableDemo {
	public static void main(String[] args) {
		ImmutableClassDemo im=new ImmutableClassDemo(100);
		System.out.println(im.i);
		im.i=150;
		System.out.println(im.i);
		
	}

}
