package wrapperClasses;

public class valueOfDemo {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(12);
		Double d = Double.valueOf(10.5);
		Boolean b = Boolean.valueOf("falsse");
		System.out.println(i);
		
		System.out.println(i.byteValue() );
		Integer j=10;
		System.out.println(j.intValue());
		int m=10;
		int k=j;
		System.out.println(k);
				
	}

}
