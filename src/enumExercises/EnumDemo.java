package enumExercises;

public class EnumDemo {
	public static void main(String[] args) {
		Apple ap;
		ap=Apple.chinna;
		System.out.println(ap);
	
		switch(ap) {
		case chinna:
			System.out.println("chinna case");
			break;
		
		case honey:
			System.out.println("honey case");
			break;
			
		}
		
		Apple[] v = Apple.values();
		for(Apple a:v) {
			System.out.println(a);
		}
		System.out.println( Apple.valueOf("chinna"));
	}

}
