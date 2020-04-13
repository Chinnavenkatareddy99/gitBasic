package constructor;

public class COverloading {
	int id;
	String name;
	double marks;
	
	COverloading(int i,String n,double m){
		this.id=i;
		this.name=n;
		this.marks=m;
		
	}
	COverloading(){
		id=22;
		name="chinna";
		marks=99.5;
	}
	COverloading(String name){
		this.name=name;
		id=22;
		marks=99.5;
	}
	
	void display() {
		System.out.println("name: "+name+" id: "+id+" marks: "+marks);
	}
	
	public static void main(String[] args) {
		COverloading c=new COverloading(22, "chinna", 99.5);
		COverloading co=new COverloading();
		COverloading cc=new COverloading("chinna");
		c.display();
		co.display();
		cc.display();
	
	}

}
