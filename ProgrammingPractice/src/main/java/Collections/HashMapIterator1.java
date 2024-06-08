package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator1 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        
        for(Map.Entry<String, Integer> entry:hashMap.entrySet()) {
        	String keys=entry.getKey();
        	Integer values=entry.getValue();
        	System.out.println("For the keys "+keys+" the values is "+values);
        	
        	if(values.equals(28)) {
        		System.out.println(entry.getKey());
        	}
        }

	}

}
