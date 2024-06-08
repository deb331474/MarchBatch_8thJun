package StringAndCharArray;

public class CharCount {

	public static void main(String[] args) {
		
		String s="Hi Welcome to Java Classes Tommorow At 2.00 p.m!!";
		
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count1++;
				
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count2++;
				
			}
			else {
				count3++;
				
			}
			
		}
		System.out.println("Total no of small letters:"+count);

		System.out.println("Total no of capital letters:"+count1);
		System.out.println("Total no of digits letters:"+count2);
		System.out.println("Total no of special letters:"+count3);
	}

}
