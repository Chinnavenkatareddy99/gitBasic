package classloading;

public class Sample {
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	
	Sample(){
		System.out.println("constructor block");
	}

	
}
