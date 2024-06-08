package StringAndCharArray;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strings = { "flower", "flour", "florida" };

		String commonPrefix = LongestCommonPrefix(strings);
		
		System.out.println("Longest Common Prefix"+commonPrefix);

	}

	private static String LongestCommonPrefix(String[] strings) {

		if (strings.length == 0) {

			return "";

		}
		String prefix = strings[0];

		for (int i = 1; i < strings.length; i++) {

			while (strings[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}

			}

		}

		return prefix;
	}

}
