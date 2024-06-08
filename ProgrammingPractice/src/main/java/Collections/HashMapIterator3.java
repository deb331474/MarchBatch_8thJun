package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator3 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        
        for(Integer val:hashMap.values()) {
        	System.out.println(val);
        }

	}

}
