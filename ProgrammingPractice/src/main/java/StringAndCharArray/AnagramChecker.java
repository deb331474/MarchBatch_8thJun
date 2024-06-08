package StringAndCharArray;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {

		String str1="listen";
		String str2="silentsd";
		
		boolean areAnagrams=areAnagrams(str1,str2);
		System.out.println("The given strings are anagrams: "+areAnagrams);
	}

	private static boolean areAnagrams(String str1, String str2) {

		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		return Arrays.equals(charArray1,charArray2);
		
	}

}
