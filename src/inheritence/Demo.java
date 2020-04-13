package inheritence;

public class Demo {

	public static void main(String[] args) {
		/*One o=new One(10, 12, 14);
		o.test();
		o.method();
		System.out.println(o.i+" "+o.j+" ");
	
		Two t=new Two(11, 13, 15, 16, 18);
		System.out.println(t.i+" "+t.j+" "+t.l+" ");
		t.test();
		t.method();*/
		
		One o=new Two();
		o.test();
		o.method();
		System.out.println(o.p);
		
		One o1=new One();
		o1.test();
		o1.method();
		System.out.println(o1.p);
		
		Two t=new Two();
		t.test();
		t.method();
		System.out.println(t.p);
		
		//Two t1=new One();
		
	
		
		

	}

}
