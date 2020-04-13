package strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s="chinna";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append(" navya ");
		System.out.println(sb);
		s.concat("honey");
		System.out.println(s);
		
		System.out.println(sb.append(" honey"));
		sb.insert(10, " java ");
		System.out.println(sb);
		//System.out.println(sb.reverse());
		System.out.println(sb.delete(0,6));
	}

}
