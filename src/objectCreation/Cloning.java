package objectCreation;

public class Cloning implements Cloneable {
	int marks=95;
	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning c=new Cloning();
		System.out.println(c.marks);
		Object obj = c.clone();
		
		Cloning c2=(Cloning) obj;
		System.out.println(c2.marks);
		
	}

}
