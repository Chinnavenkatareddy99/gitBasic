package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewMapDemo {
	public static void main(String[] args) {
		ArrayList<NamePhoneEmail> list = new ArrayList<>();
		list.add(new NamePhoneEmail("chinna", 8888, "99@gmail"));
		list.add(new NamePhoneEmail("honey papa", 8888, "99@gmail"));
		list.add(new NamePhoneEmail("navya july", 8888, "99@gmail"));
		System.out.println(" the oroginal list:");
		list.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));
		System.out.println("new stream .....");
		list.stream().map(a -> new NamePhone(a.name, a.phone)).forEach(a -> System.out.println(a.name + " " + a.phone));
		System.out.println("only for custom with help filter ...");
	
		list.stream().filter(a->a.name.equals("chinna")).map(a->new NamePhone(a.name,a.phone)).forEach(x->System.out.println(x.name+" "+x.phone));
	
	System.out.println("collector demo.....");
	List<NamePhone> np = list.stream().map(a->new NamePhone(a.name,a.phone)).collect(Collectors.toList());
	for(NamePhone e:np) {
		System.out.println(e.name+" "+e.phone);
	}
	list.stream().filter(a->a.name.equals("honey papa")).map(a->new NamePhone(a.name,a.phone)).collect(Collectors.toSet()).forEach(x->System.out.println(x.name+" "));
	
	
	
	}
	

}
