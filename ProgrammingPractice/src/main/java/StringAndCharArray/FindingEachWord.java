package StringAndCharArray;

import java.util.HashMap;
import java.util.Map;

public class FindingEachWord {

	public static void main(String[] args) {
		
		String input="Venkat Ram Debasish Pruseth Venkat";
		
		String[] words=input.split(" ");
		
		Map<String, Integer> wordOccurences=new HashMap<String, Integer>();
		
		for(String word:words) {
			wordOccurences.put(word,wordOccurences.getOrDefault(word,0)+1);
		}

		for(Map.Entry<String,Integer> entry:wordOccurences.entrySet()) {
			System.out.println("Word '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
		}
	}

}
