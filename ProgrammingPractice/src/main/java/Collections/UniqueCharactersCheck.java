package Collections;

import java.util.HashSet;

public class UniqueCharactersCheck {

	public static void main(String[] args) {

		String input="abbcccdefg";
		
		boolean hasUniqueCharacters = hasUniqueCharacters(input);
		
		System.out.println("Has Unique Characters: "+hasUniqueCharacters);
		
		
		
	}
	
	public static boolean hasUniqueCharacters(String input) {
		HashSet<Character> set=new HashSet<Character>();
		
		for(char c:input.toCharArray()) {
			if(!set.add(c)) {
				return false;
			}
		}
		return true;
		
	}
	

}
