package StringAndCharArray;

public class RemovingNonAplhabeticCharacters {

	public static void main(String[] args) {

		String originalString = "Hello123, World!";
		
		StringBuilder sb=new StringBuilder();
		
		for(char c:originalString.toCharArray()) {
			if(Character.isAlphabetic(c)||Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		
		
		System.out.println(sb);
		
	}

}
