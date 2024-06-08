package in.debasish.stringClass;

public class SeperateReverseofEachWordinString {

	public static void main(String[] args) {

		String s="Debasish Pruseth";
		
		String[] p=s.split(" ");
		
		String res="";
		
		for(int i=0;i<p.length;i++) {
			
			String t=p[i];
			
			for(int j=t.length()-1;j>=0;j--) {
				char ch=t.charAt(j);
				res=res+ch;
			}
			
			res=res+" ";
		}
		
		System.out.println(res);
	}

}
