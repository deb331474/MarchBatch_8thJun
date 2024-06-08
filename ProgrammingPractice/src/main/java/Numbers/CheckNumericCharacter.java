package Numbers;

public class CheckNumericCharacter {

	public static void main(String[] args) {

		String s="SAbjkdsbakajskjsk*&(*&(&(&(WQ";
		boolean containMatches=s.matches(".*\\d.*");
		
		if(containMatches) {
			System.out.println("There are numeric data");
		}
		else {
			System.out.println("THere are no numeric data");
		}
		
	}

}
