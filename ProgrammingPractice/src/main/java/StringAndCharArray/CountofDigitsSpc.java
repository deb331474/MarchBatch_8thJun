package StringAndCharArray;

public class CountofDigitsSpc {

	public static void main(String[] args) {
		

		int UcaseCount=0,scharCount=0,numbersCount=0,sCaseCount=0;
		
		String s="Welcome to JAVA Classs @12345";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				sCaseCount++;
				
			}
			else if(Character.isUpperCase(ch)) {
				UcaseCount++;
			}
			else if (Character.isDigit(ch)) {
				numbersCount++;
				
			}
			else {
				scharCount++;
			}
		}
		System.out.println("Upper Case count:"+UcaseCount);
		System.out.println("Lower Case count:"+sCaseCount);
		System.out.println("Digit count is:"+numbersCount);
		System.out.println("Special character count:"+scharCount);
	}

}
