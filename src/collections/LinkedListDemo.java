package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(100);
		l.add(11);
		l.add(05);
		l.add(13);
		
		/*System.out.println(l);
		l.remove(1);
		System.out.println(l.indexOf(12));*/
		Comparator<Object> c = Collections.reverseOrder();
		Collections.sort(l,c);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println("mim::::"+Collections.min(l));
	}

}
