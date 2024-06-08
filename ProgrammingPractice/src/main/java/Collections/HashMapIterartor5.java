package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterartor5 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("James", 29);
        
        hashMap.entrySet().stream().forEach(entry -> {
        	String key=entry.getKey();
            Integer val=entry.getValue();
            System.out.println("Key: "+key+" values are: "+val);
        });

	}

}
