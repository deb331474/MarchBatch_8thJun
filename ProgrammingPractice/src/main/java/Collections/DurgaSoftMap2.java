package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DurgaSoftMap2 {

	public static void main(String[] args) {

		Map<String, Double> map2=new HashMap<String, Double>();
		
		map2.put("one",(double) 1);
		map2.put("two",(double) 2);
		map2.put("three",(double) 3);
		
		Double val=map2.get("one");
		System.out.println(val);
		
		Map<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(1, "Debasish");
		map3.put(2, "Kumar");
		map3.put(3, "Pruseth");
		map3.put(4, "Sambalpur");
		System.out.println(map3);
		
		boolean key=map3.containsKey(1);
		System.out.println(key);
		
		boolean valu=map3.containsValue("Debasish");
		System.out.println(valu);
		
		
		Set<Integer> s=map3.keySet();
		System.out.println(s);
		
		Collection c=map3.values();
		System.out.println(c);

		Set s1=map3.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry) itr.next();
			System.out.println(m1.getKey()+".........."+m1.getValue());
			if(m1.getValue().equals("Debasish")) {
				m1.setValue(100);
			}
			System.out.println(map3);
			
		}
	}

}
