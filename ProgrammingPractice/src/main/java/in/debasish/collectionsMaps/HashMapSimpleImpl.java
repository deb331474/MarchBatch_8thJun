package in.debasish.collectionsMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSimpleImpl {

	public static void main(String[] args) {

		HashMap<String,Integer> hmap=new HashMap<>();
		
		hmap.put("Debasish", 1);
		hmap.put("Pruseth", 2);
		hmap.put("Khusboo", 3);
		hmap.put("Abhijeet", 4);
		
		System.out.println(hmap);
		
		Iterator<Map.Entry<String,Integer>> iterator=hmap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry=iterator.next();
			System.out.println("Key is "+entry.getKey()+" Values are "+entry.getValue());
		}
		
	}

}
