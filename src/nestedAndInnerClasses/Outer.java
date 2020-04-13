package nestedAndInnerClasses;

public class Outer {
	
	int outer_x=10;
	void test() {
		Inner i=new Inner();
		i.display();
	//	System.out.println(inner_y);
	}
	
	
	class Inner{
		int inner_y=10;
		void display() {
			System.out.println(outer_x);
		}
	}

}
