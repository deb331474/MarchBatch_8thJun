package Collections;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {

	public static void main(String[] args) {

		Map<String, Integer> m = new java.util.IdentityHashMap<String, Integer>();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put("Debasish", i2);
		m.put("Preuseth", i2);

		
		System.out.println(m.get(10));

	}

}
