package interfcaes;

public class DefualtDemo implements DefaultMethods {

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		DefualtDemo d=new DefualtDemo();
		System.out.println(d.getName());
		System.out.println(d.getClear());
	}

}
