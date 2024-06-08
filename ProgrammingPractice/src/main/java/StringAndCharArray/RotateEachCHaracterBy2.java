package StringAndCharArray;

public class RotateEachCHaracterBy2 {

	public static void main(String[] args) {

		String s="AebasishkuMarPrusetH";
		String enc="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
				if((c>='A'&& c<='Z')||(c>='a'&& c<='z')) {
					c+=2;
					if((c>'Z' && c<='Z'+2) || c>'z') {
						c-=26;
					}
					enc+=c;
				}else{
					enc+=c;
				}
		}
		System.out.println(enc);
	}

}
