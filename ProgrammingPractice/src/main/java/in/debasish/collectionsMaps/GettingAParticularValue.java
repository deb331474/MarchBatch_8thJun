package in.debasish.collectionsMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GettingAParticularValue {

	public static void main(String[] args) {

		Map<String,Integer> hashMap=new HashMap<>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		
		Integer valueTofind=2;
		
		Iterator<Entry<String,Integer>> iterator=hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String,Integer> entry= iterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			
			if(valueTofind==value) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
		
		//Iterating over key-value pairs
		
		Iterator<Entry<String, Integer>> entryIterator=hashMap.entrySet().iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry=entryIterator.next();
			
			System.out.println("Key is:"+entry.getKey()+"And the value is "+entry.getValue());
		}
		
		Iterator<String> keyIterator=hashMap.keySet().iterator();
		{
			while(keyIterator.hasNext()) {
				String key=keyIterator.next();
				
				System.out.println(key);
			}
		}
		
		Iterator<Integer> values=hashMap.values().iterator();
		
		while(values.hasNext()) {
			Integer val=values.next();
			System.out.println(val);
		}
	}

}
