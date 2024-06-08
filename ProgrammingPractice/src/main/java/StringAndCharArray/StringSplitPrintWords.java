package StringAndCharArray;

public class StringSplitPrintWords {

	public static void main(String[] args) {

		String str="SAbjkdsbakajskjsk*&(*&(&(&(WQ";
		
		String[] words=str.split("[^a-zA-Z]+");
		
		System.out.println("words in the string are:");
		for(String wd:words) {
			System.out.println(wd);
		}
		
		String[] words1=str.split("[^a-zA-Z]+");
		
		for(String ch:words1) {
			System.out.println(ch);
		}
		
	}

}
