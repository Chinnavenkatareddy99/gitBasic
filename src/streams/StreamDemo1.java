package streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class StreamDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList<>();
		Random r=new Random();
		for(int i=0;i<5;i++) {
			myList.add(r.nextInt(100));
		}
		System.out.println(myList);
		Optional<Integer> minVal = myList.stream().min(Integer::compare);
		if(minVal.isPresent()) {
		System.out.println("minimum value is: "+minVal.get());
		}
		System.out.println("the sorted list is:");
		
		 myList.stream().sorted().forEach(x->System.out.println(x+" "));
		 System.out.println("the even values are:");
		 myList.stream().filter(x->(x%2==0)).filter(x->x>50).forEach(x->System.out.println(x));
		/*int[] arr= {10,20,15,36};
		IntStream arrayStream = Arrays.stream(arr);
		arrayStream.sorted().forEach(x->System.out.println(x));*/
	
	}

}
