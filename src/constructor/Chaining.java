package constructor;

public class Chaining {
	
	Chaining(){
		this(10);
		
		System.out.println("default.......");
		
	}
	
	Chaining(int i){
		this(10.5,5);
		System.out.println("one para.......");
	}
	
	Chaining(double d,int i){
		System.out.println("two para.......");
	}
	public static void main(String[] args) {
		Chaining c=new Chaining();
	}

}
