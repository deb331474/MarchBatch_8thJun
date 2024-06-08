package Collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory1 {

	public static void main(String[] args) {

		Map<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Debasish", 10189723);
		phoneBook.put("Rupesh",789432342);
		phoneBook.put("Pruseth", 101099723);
		phoneBook.put("Shibasish",709432342);
		
		String name="Rupesh";
		
		if(phoneBook.containsKey(name)) {
			Integer number=phoneBook.get(name);
			
			System.out.println(name+" phone number is: "+number);
		}
		
	}

}
