package Collections;

import java.util.HashMap;

public class WordCounter1 {

	public static void main(String[] args) {
		
		String text="This is a sample text. This text contains sample words.";
		String[] words=text.split(" ");
		
		HashMap<String,Integer> wordFrequency=new HashMap<String, Integer>();
		
		for(String word:words) {
			word=word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			wordFrequency.put(word,wordFrequency.getOrDefault(word, 0)+1);
		}
		for(String word:wordFrequency.keySet()) {
			int frequnecy=wordFrequency.get(word);
			System.out.println(word+" "+frequnecy);
		}

	}

}
