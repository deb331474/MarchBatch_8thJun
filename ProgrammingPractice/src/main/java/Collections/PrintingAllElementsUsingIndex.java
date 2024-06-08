package Collections;

import java.util.ArrayList;

public class PrintingAllElementsUsingIndex {

	public static void main(String[] args) {
		
		ArrayList<String> c1=new ArrayList<String>();
		
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		System.out.println("\nOriginal Array List: "+c1);
		
		System.out.println("\nPrint using index of element: ");
		
		int n=c1.size();
		
		for(int i=0;i<n;i++) {
			System.out.println(c1.get(i));
		}
	}

}
