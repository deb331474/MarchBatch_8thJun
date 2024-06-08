package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapingtwoElementsInAArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Debasish");
		c1.add("Kumar");
		c1.add("Pruseth");
		c1.add("Rupesh");
		c1.add("Deba");
		c1.add("Debuthedon");
		
		System.out.println("Array List before swap:");
		for(String a:c1) {
			System.out.println(a);
		}

		Collections.swap(c1, 0, 2);
		System.out.println("Array List After swap");
		
		for(String b:c1) {
			System.out.println(b);
		}
	}

}
