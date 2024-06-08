package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapiteratordup1 {

	public static void main(String[] args) {

		Map<String,Integer> hmap=new HashMap<>();
		hmap.put("Alice", 10);
		hmap.put("Debasish", 18);
		hmap.put("Khusboo", 78);
		
		System.out.println(hmap);
		
		Iterator<Map.Entry<String, Integer>> iterator=hmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry=iterator.next();
			String keys=entry.getKey();
			Integer values=entry.getValue();
			System.out.println("the key is "+keys+" and the value is "+values);
		}
	}

}
