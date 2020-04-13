package lamdaExpressions;

public class ExceptionDemo {
	//static int num=10;
	public static void main(String[] args) throws EmptyArrayException {
		 // int num=10;
		
		double [] values= {10.0,20.0,5.0};
		double [] v= {};
		
		ExceptionInter e=(n)->{
			//num++;
			
			double sum=0;
			if(n.length==0)
				throw new EmptyArrayException();
			for(int i=0;i<n.length;i++) {
				sum+=n[i];
				
			}
			return sum;
			
		};
		System.out.println("the average is:"+e.func(v));
	}

}
