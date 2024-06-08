package Collections;

import java.util.HashSet;

public class CapitalizeUniqueLetters {

	public static void main(String[] args) {

		String input="eggcdAScAfgrrb124";
		String result=capitalizeUniqueLetters(input);
		
		System.out.println("Capitalized Lettrs are: "+result);
		
	}

	private static String capitalizeUniqueLetters(String input) {
		HashSet<Character> unCharacters=new HashSet<Character>();
		StringBuilder  result=new StringBuilder();
		
		for(char c:input.toCharArray()) {
			if(Character.isLetter(c) && Character.isLowerCase(c) && unCharacters.add(c)) {
				result.append(Character.toUpperCase(c));
			}
			
			else if(Character.isUpperCase(c) && unCharacters.add(Character.toLowerCase(c))){
				result.append(c);
			}
		}
		
		return result.toString();
	}

}
