package interfcaes;

public class MultilpleInheritence implements Alpha,Beta{
	
	@Override
	public void rset() {
		
		Beta.super.rset();
	}
	
public static void main(String[] args) {
	Alpha.show();
	Beta.show();
MultilpleInheritence m=new MultilpleInheritence();
m.rset();
}


	  

}
