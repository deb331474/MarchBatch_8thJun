package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicatesUsingHashSet {

	public static void main(String[] args) {
		
		String[] array= {"apple","banana","apple","banana","orange"};
		
		HashSet<String> uniqFruits=new HashSet<String>(Arrays.asList(array));
		
		String[] uniqueArray=uniqFruits.toArray(new String[0]);
		
		System.out.println("The original Array is: "+Arrays.toString(array));
		
		System.out.println("Arrays after removing the duplicates is: "+Arrays.toString(uniqueArray));
		
		

	}

}
