package Collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

	public static void main(String[] args) {

		Map<Integer,String> employeeDb=new HashMap<Integer, String>();
		
		employeeDb.put(121, "Debasish");
		
		employeeDb.put(134, "Kumar");
		
		employeeDb.put(145, "Pruseth");
		
		employeeDb.put(456, "Laida");
		
		
		System.out.println(employeeDb);
		
		for(Map.Entry<Integer, String> entry:employeeDb.entrySet()) {
				
				int keys=entry.getKey();
				String values=entry.getValue();
				if (keys==134) {
				System.out.println(entry.getValue());
				}
			}
		}
	}
