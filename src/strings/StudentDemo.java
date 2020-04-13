package strings;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student("chinna",22);
		
		Student s2=new Student("chinna",22);
		Student s3=new Student("honey",15);
		
		String str=new String("chinnahoney");
		String str1=new String("chinnahoney");
		
		String s="chinna";
		String ss="chinna";
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		
	}

}
