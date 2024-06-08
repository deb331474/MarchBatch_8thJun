package StringAndCharArray;

public class StringReversal {

	public static void main(String[] args) {

		String input="This is a simple sentence";
		
		String revString=reversedString(input);
		
		System.out.println("Reversed String is : "+revString);
		
		
	}

	private static String reversedString(String input) {

		char[] charArray=input.toCharArray();
		int start=0;
		int end=input.length()-1;
		
		while(start<end) {
			char temp=charArray[start];
			charArray[start]=charArray[end];
			charArray[end]=temp;
			start++;
			end--;
			
		}
		return new String(charArray);
	}

}
