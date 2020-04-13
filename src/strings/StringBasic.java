package strings;

public class StringBasic {
	public static void main(String[] args) {
		String s1="chinna";
		
		String s2="honey";
		String s3="chinna";
		String s4=new String("chinna");
		
	/*	System.out.println(s2.startsWith("h"));
		char[] charArray = s3.toCharArray();
		for(char c:charArray) {
			System.out.println(c);
		}
		String s4=s2;
		System.out.println(s1.length());
		System.out.println(s2.charAt(3));*/
		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	
	}

}
