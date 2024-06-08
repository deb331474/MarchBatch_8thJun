package StringAndCharArray;

public class PiglatinWord {

	public static void main(String[] args) {

		String str="EAR";
		String pi="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U') {
				if(i==0) {
					pi=str+"WAY";
				}
				else {
					pi=str.substring(i)+str.substring(0, i)+"AY";
					break;
				}
				
			}
			System.out.println(pi);
		}
	}

}
