package streams;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("chinna");
		list.add("chinna gadu");
		list.add("chinna podo");
		Spliterator<String> sp = list.stream().spliterator();
		while(sp.tryAdvance(x->System.out.println(x)));
	}

}
