package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		String[] arr= {"apple","banana","apple","orange","banana"};
		
		HashSet<String> uniqueElements=new HashSet<String>(Arrays.asList(arr));
		
		String[] uniqueArray=uniqueElements.toArray(new String[0]);
		
		System.out.println("Original Array is: "+Arrays.toString(arr));
		
		System.out.println("Arrays after removing the duplicates elements: "+Arrays.toString(uniqueArray));
		
		
		
	}

}
