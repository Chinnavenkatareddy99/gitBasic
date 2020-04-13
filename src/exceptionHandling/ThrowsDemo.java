package exceptionHandling;

public class ThrowsDemo {
	
	static void thrown() throws IllegalAccessException{
		throw new IllegalAccessException();
	}
	public static void main(String[] args)  {
		try {
		thrown();
		}
		catch(IllegalAccessException i) {
			i.printStackTrace();  
		}
		System.out.println("helloooooooo...");
	}

}
