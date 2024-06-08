package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesfromList {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>(Arrays.asList("Alice","Bob","David", "Alice", "Charlie", "Bob"));
		
		Set<String> uniqueElements=new LinkedHashSet<String>(names);
		
		List<String> duplcatedElements=new ArrayList<String>(uniqueElements);
		
		System.out.println("Original List:"+names);
		
		System.out.println("List with Duplicates Removed: " +duplcatedElements);
	}

}
