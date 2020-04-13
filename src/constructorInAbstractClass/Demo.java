package constructorInAbstractClass;

public class Demo extends Main{
	int k;
	int l;
	Demo(int k,int l,int x,int y){
		super(x,y);
		this.k=k;
		this.l=l;
		
		
	}

	public static void main(String[] args) {
		
		Demo d=new Demo(10,20,40,60);
		
		System.out.println(d.k);
	}

}
