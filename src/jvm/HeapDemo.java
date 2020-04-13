package jvm;

public class HeapDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.maxMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory());
		//java-Xmx128m HeapDemo;
	}

}
