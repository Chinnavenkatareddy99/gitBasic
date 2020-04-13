package collections;

 import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	/*	MyComparator mc= new MyComparator(); 
		TreeSet<Integer> t=new TreeSet<>(mc.reversed());*/
		TreeSet<Integer> t=new TreeSet<>((a,b)->b.compareTo(a));
		
		t.add(15);
		t.add(1);
		t.add(25);
		t.add(14);
	/*for(Integer list:t) {
		System.out.println(list);
	}*/
		
		
		t.stream().forEach(a->System.out.println(a));
	}

}
