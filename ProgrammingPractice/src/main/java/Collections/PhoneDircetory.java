package Collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDircetory {

	public static void main(String[] args) {

		Map<String, String> phoneBook=new HashMap<String, String>();
		
		phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "987-654-3210");
        phoneBook.put("Charlie", "555-555-5555");
        
        String name="Bob";
        
        if(phoneBook.containsKey(name)) {
        	String phnNumber=phoneBook.get(name);
        	System.out.println(name + "'s phone number is " + phnNumber);
        } else {
            System.out.println(name + " is not in the phone directory.");
        }
        
	}

}
