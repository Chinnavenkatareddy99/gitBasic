package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//HashMap<String,Double> hm=new HashMap<>();
		//TreeMap<String,Double> hm=new TreeMap<>();
		LinkedHashMap<String,Double> hm=new LinkedHashMap<>();
		hm.put("chinna",new Double(25000.00));
		hm.put("honey",new Double(15000.00));
		hm.put("ajjjj",new Double(5000.00));
		//System.out.println(hm);
		Set<Entry<String, Double>> set = hm.entrySet();
		for(Map.Entry<String, Double> m:set) {
			System.out.println("name: "+m.getKey());
			System.out.println("balmaces: "+m.getValue());
			System.out.println();
			
		}
		double balance=hm.get("chinna");
		hm.put("chinna", balance +5000.00);
		System.out.println("chinna new balance:"+hm.get("chinna"));
	}

}
