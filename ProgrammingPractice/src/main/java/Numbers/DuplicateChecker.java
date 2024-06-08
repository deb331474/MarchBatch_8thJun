package Numbers;

import java.util.HashSet;

public class DuplicateChecker {

	public static void main(String[] args) {

		int[] numbers= {1, 2, 3, 4, 5, 2};
		
		boolean hasDuplicates=hasDuplicates(numbers);
		
		System.out.println("Has Duplicates: "+hasDuplicates);
		
	}

	private static boolean hasDuplicates(int[] numbers) {

		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int num:numbers) {
			if(!set.add(num)) {
				return true;
				
			}
		}
		return false;
	}

}
