package Collections;

import java.util.HashMap;
import java.util.Map;

public class GettingtheMostCommonCharacter {

	public static void main(String[] args) {

		String input = "helloJava";

		char mostCommon = findMostCommonCharacter(input);

		System.out.println("Input String: " + input);
		System.out.println("Most Common Character: " + mostCommon);

	}

	private static char findMostCommonCharacter(String input) {

		Map<Character, Integer> charCount = new HashMap<>();

		for (char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		char mostCommon = 0;
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > mostCommon) {
				mostCommon = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		return mostCommon;
	}

}
