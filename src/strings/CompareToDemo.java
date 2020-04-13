package strings;

public class CompareToDemo {
	static String s[]={"hii","bye","good","Bye"};
	public static void main(String[] args) {
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;i<s.length;i++) {
				if(s[j].compareTo(s[i])<0) {
					 String str=s[i];
					s[i]=s[j];
					s[j]=str;	
				}
			}
			
			System.out.println(s[i]);
		}
		
	}

}
