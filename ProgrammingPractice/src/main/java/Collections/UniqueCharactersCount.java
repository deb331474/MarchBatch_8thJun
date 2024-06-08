package Collections;

import java.util.HashSet;

public class UniqueCharactersCount {

	public static void main(String[] args) {

		String text="abccdefg";
		boolean hasuniqueCharacters=hasuniqueCharacters(text);
		
		System.out.println(hasuniqueCharacters);
	}

	private static boolean hasuniqueCharacters(String text) {

		HashSet<Character> set=new HashSet<Character>();
		
		for(char c:text.toCharArray()) {
			if(!set.add(c)) {
				return false;
				
			}
			
		}
	
		return true;
	}

}
