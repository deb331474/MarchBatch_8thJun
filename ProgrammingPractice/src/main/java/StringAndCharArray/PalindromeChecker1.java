package StringAndCharArray;

public class PalindromeChecker1 {

	public static void main(String[] args) {

		String str="madam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The string is paliondrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
	}

}
