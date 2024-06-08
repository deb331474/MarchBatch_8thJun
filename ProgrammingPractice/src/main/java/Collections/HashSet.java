package Collections;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet<String> set=new java.util.HashSet<String>();
		
		set.add("Alice");
		set.add("Bob");
		set.add("Charlie");
		set.add("Alice");
		
		//System.out.println(set);
		
		for(String st:set) {
			System.out.println(st);
		}

	}

}
