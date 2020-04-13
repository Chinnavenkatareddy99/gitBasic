package acessControl;

public class PPDemo {
	public static void main(String[] args) {
		PublicPrivateDemo p=new PublicPrivateDemo(10,25);
				p.a=10;
				System.out.println(p.a+" "+p.getB());
		
	}

}
