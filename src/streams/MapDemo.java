package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.stream().map(a->Math.sqrt(a)).forEach(x->System.out.println(x));
		System.out.println("next............");
		Double red = list.stream().map(a->Math.sqrt(a)).reduce(1.0,(a,b)->a+b);
		System.out.println(red);
		
		Stream<Integer> map = list.stream().map(a->a+1);
		
		Stream<Integer> filter = list.stream().filter(x->x>4);
		filter.forEach(x->System.out.println(x));
		System.out.println("converting map to doubleMap....");
		list.stream().mapToDouble(a->Math.ceil(a)).forEach(x->System.out.println(x));
	}

}
