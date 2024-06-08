package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterartor4 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        
        Iterator<Map.Entry<String, Integer>> iterator=hashMap.entrySet().iterator();
        
        while(iterator.hasNext()) {
        	Map.Entry<String, Integer> entry=iterator.next();
        	String keys=entry.getKey();
        	Integer val=entry.getValue();
        	
        	System.out.println("Keys :"+keys+" values are : "+val);
        }

	}

}
