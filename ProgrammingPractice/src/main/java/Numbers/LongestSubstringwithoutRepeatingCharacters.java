package Numbers;

import java.util.HashMap;

public class LongestSubstringwithoutRepeatingCharacters {

	public static void main(String[] args) {

		
		String input="abcabcbb";
		int maxLength=lengthofLongestSubstring(input);
		System.out.println("Length of Longest Substring: "+maxLength);
		
	}

	private static int lengthofLongestSubstring(String input) {

		HashMap<Character,Integer> charIndexMap=new HashMap<Character, Integer>();
		
		int maxlength=0;
		int start=0;
		
		for(int end=0;end<input.length();end++) {
			char c=input.charAt(end);
			if(charIndexMap.containsKey(c)) {
				start=Math.max(start,charIndexMap.get(c)+1);
			}
			charIndexMap.put(c,end);
			maxlength=Math.max(maxlength,end-start-1);
		}
		
		return maxlength;
	}

}
