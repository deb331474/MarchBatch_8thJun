package in.debasish.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillExample {
	
	public static void main(String[] args) {
		
	
	
		        List<String> names = new ArrayList<>();
		        names.add("Alice");
		        names.add("Bob");
		        names.add("Charlie");

		        Collections.fill(names, "Unknown");

		        System.out.println("Filled List: " + names);

	}

}
