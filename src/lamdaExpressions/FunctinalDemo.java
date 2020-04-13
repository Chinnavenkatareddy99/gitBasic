package lamdaExpressions;

public class FunctinalDemo {
	public static void main(String[] args) {
		Functional<String> reverse=(str)->{
			String result=" ";
			for(int i=str.length()-1;i>=0;i--) {
				result +=str.charAt(i);
			}
			return result;
			
		};
		System.out.println("string reverse:"+reverse.someFun("Chinna"));
		
		
		Functional<Integer> fact=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				result=i*result;
			}
			return result;
			
		};
		System.out.println("factorial of given number is:"+fact.someFun(5));
		
	}
	
	

}
