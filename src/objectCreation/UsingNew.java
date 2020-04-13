package objectCreation;

public class UsingNew {
	
	static{
		System.out.println("static.........");
		
	}
	{
		System.out.println("instance........");
	}
	UsingNew(){
		System.out.println("zero para constructor.......");
	}
	
	UsingNew(int x){
		System.out.println("param with constructor........");
	}
	
	public static void main(String[] args) {
		UsingNew u=new UsingNew();
		
		//UsingNew u1=new UsingNew(5);
	}

}
