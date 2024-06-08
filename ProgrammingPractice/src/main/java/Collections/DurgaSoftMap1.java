package Collections;

import java.util.HashMap;
import java.util.Map;

public class DurgaSoftMap1 {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		
		System.out.println(map);
		
		//retriving a value by key
		
		int val=map.get("one");
		System.out.println("value for the intended key is: "+val);
		
		//checking if the map contains particular key
		
		boolean containsKey=map.containsKey("one");
		System.out.println(containsKey);
		
	}

}
