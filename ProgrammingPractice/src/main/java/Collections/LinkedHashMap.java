package Collections;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {

		Map<String, Integer> m=new java.util.LinkedHashMap<String, Integer>();
		
		m.put("Debasish", 100);
		m.put("Pruseth", 1080);
		m.put("Singapore", 1300);
		m.put("Australia", 1400);
		//here in the linked hash map insertion order is prreserved
		
		System.out.println(m);
		
	}

}
