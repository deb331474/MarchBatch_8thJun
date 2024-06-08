package StringAndCharArray;

public class PalindromeChecker {

	public static void main(String[] args) {

		String input = "racecar";

		boolean isPalidme = isPalindrome(input);
		
		System.out.println("is Palindrome : "+isPalidme);

	}

	private static boolean isPalindrome(String input) {

		input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

		String reversed = new StringBuilder(input).reverse().toString();

		return input.equals(reversed);
	}

}
