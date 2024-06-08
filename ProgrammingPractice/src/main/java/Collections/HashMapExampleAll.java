package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleAll {

	public static void main(String[] args) {
		
		Map<String,Integer> hashMap=new HashMap<>();
		
		    hashMap.put("Alice", 25);
	        hashMap.put("Bob", 30);
	        hashMap.put("Charlie", 28);
	        hashMap.put("David", 22);
	        hashMap.putIfAbsent("George", 27);
	        hashMap.compute("David",(key, value)->value+1);
	        hashMap.merge("Bob", 10, Integer::sum);
	        hashMap.merge("Charlie", 5,Integer::sum);

	        System.out.println(hashMap);
	        
	        int ageOfAlice=hashMap.get("Alice");
	        System.out.println("Age of Alice: "+ageOfAlice);
	        
	        boolean isKeyExists=hashMap.containsKey("David");
	        
	        System.out.println("Does key exist in the hashmap: "+isKeyExists);
	        
	        hashMap.put("Alice", 29);
	        
	        System.out.println(hashMap);
	        
	        System.out.println("Iterating through the keys and the values: ");
	        
	        for(String name:hashMap.keySet()) {
	        	int age=hashMap.get(name);
	        	System.out.println(name +" "+age);
	        }
	        
	        int size=hashMap.size();
	        System.out.println(size);
	        
	        System.out.println("Iterating through map entry");
	        
	        for(Map.Entry<String, Integer> entry:hashMap.entrySet()) {
	        	String key=entry.getKey();
	        	Integer value=entry.getValue();
	        	System.out.println("the key is "+key+" and value is: "+value);
	        }
	        
	        Collection<Integer> values=hashMap.values();
	        System.out.println("The values are:"+values);
	        
	        Set<String> keys=hashMap.keySet();
	        System.out.println("Keys are:"+keys);
	        
	        Integer ageOfCharlie=hashMap.getOrDefault("Ramson",78);
	        System.out.println(hashMap);
	        
	        
	}

}
