package in.debasish.stringClass;

public class FirstNonRepeatedCharcater {

	public static void main(String[] args) {

		String input="programming";
		char fisrtnonRepeated=0;
		
		for(int i=0;i<input.length();i++) {
			char currentChar=input.charAt(i);
			if(input.indexOf(currentChar)==input.lastIndexOf(currentChar)) {
				fisrtnonRepeated=currentChar;
				break;
			}
		}
		
		System.out.println("Input String: " + input);
        System.out.println("First Non-Repeated Character: " + fisrtnonRepeated);
	}

}
