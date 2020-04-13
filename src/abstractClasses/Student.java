package abstractClasses;

public class Student extends Person{
	int height;
	int marks;
	
	
	
	public Student(String name, int roll, int height, int marks) {
		super(name, roll);
		this.height = height;
		this.marks = marks;
	}



	public static void main(String[] args) {
		//Student s=new Student(name, roll, height, marks);
	
	}
	

}
