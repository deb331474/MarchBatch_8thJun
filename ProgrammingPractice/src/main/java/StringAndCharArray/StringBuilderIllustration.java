package StringAndCharArray;

public class StringBuilderIllustration {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		//System.out.println(sb.toString());
		
		System.out.println(sb);
		
		sb.insert(6, "Beautiful");
		
		System.out.println(sb);
		
		sb.deleteCharAt(5);
		
		sb.delete(2, 9);
		
		System.out.println(sb);
		
		sb.replace(0, 8, "Debasish");
		
		System.out.println(sb);
	}

}
