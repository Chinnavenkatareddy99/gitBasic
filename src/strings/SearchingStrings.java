package strings;

public class SearchingStrings {
	public static void main(String[] args) {
		String s="    hii this is chinna and i am java developer of this company    ";
		System.out.println(s.length());
		System.out.println(s.indexOf("c"));
		System.out.println(s.lastIndexOf("c"));
		System.out.println(s.indexOf("c",10));
		
		
		System.out.println(s.substring(11,50));
		CharSequence sub = s.subSequence(10, 55);
		System.out.println(sub);
		for( int i=sub.length()-1;i>0;i--) {

			System.out.print(sub.charAt(i));
			
		}
		System.out.println();
		System.out.println(s.replace("i", "I"));
		System.out.println(s.trim());
		
		String result = String.join(",","in Rockwell", "automation");
		System.out.println(result);
	}

}
