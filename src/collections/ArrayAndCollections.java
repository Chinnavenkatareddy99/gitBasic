package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayAndCollections {
	public static void main(String[] args) {
		int[] arr= {10,50,20,60,9};
		String[] s= {"chinna","abay","honey"};
		List<String> sList = Arrays.asList(s);
	     System.out.println(sList);
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);
		
	}

}
