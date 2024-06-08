package StringAndCharArray;

public class StringTitleCase {

	public static void main(String[] args) {

		String sentence="this is a sample sentence";
		StringBuilder titleCase=new StringBuilder();
		boolean capitalize=true;
		
		for(char ch:sentence.toCharArray()) {
			if(Character.isWhitespace(ch)) {
				capitalize=true;
			}
			else if(capitalize) {
				ch=Character.toTitleCase(ch);
				capitalize=false;
				
			}
			titleCase.append(ch);
		}
		
		System.out.println("Original string is: "+sentence);
		System.out.println("Title case is: "+titleCase);
		
	}

}
