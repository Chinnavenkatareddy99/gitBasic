package streams;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("chinna");
		list.add("chinna gadu");
		list.add("chinna podo");
		Iterator<String> itr = list.stream().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			list.stream().iterator().forEachRemaining(x->System.out.println(x));
		}
	}

}
