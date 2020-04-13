package lamdaExpressions;

public class Basic1Demo {
	public static void main(String[] args) {
		//Basic b=()->System.out.println("heeloooo");
		
	/*	Basic b=()-> Math.random()*100;
		System.out.println("the value is:"+	b.method());*/
	
		/*Basic b=(n)->(n%2)==0;
		System.out.println(b.method3(10));
		
		Basic b1=(n)->false;
		System.out.println(b1.method3(10));*/
		/*
		Basic bb=(a,b)->a*b;
		System.out.println(bb.method(2,4));*/
		
		Basic b=(n)->{
			int result=5;
			return n*result;
			
			
		};
		System.out.println("lamda block result is:"+b.lamdaBlock(10));
		
	}

}
