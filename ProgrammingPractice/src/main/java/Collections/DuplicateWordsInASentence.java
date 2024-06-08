package Collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInASentence {

	public static void main(String[] args) {

		String input = "This is a sample sentence. This sentence contains some sample words.";

		String[] words = input.split(" ");

		Map<String, Integer> wordOccurences = new HashMap<>();

		for (String wd : words) {

			wd = wd.replaceAll("[.,!?]", "");

			wd = wd.toLowerCase();
			if (wordOccurences.containsKey(wd)) {
				wordOccurences.put(wd, wordOccurences.get(wd) + 1);
			} else {
				wordOccurences.put(wd, 1);
			}

		}

		System.out.println("Duplicate Words are:");

		for (Map.Entry<String, Integer> entry : wordOccurences.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
