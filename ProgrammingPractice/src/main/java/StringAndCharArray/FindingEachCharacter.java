package StringAndCharArray;

import java.util.HashMap;
import java.util.Map;

public class FindingEachCharacter {

	public static void main(String[] args) {
		
		String input="debas6789#09*&^%is&^%h";
		
		Map<Character, Integer> charOccurences=new HashMap<Character, Integer>();
		
		for(char c:input.toCharArray()) {
			charOccurences.put(c, charOccurences.getOrDefault(c,0)+1);
		}

		for(Map.Entry<Character,Integer> entry:charOccurences.entrySet()) {
			System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
		}
	}

}
