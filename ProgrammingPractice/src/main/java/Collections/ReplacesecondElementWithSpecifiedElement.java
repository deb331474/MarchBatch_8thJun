package Collections;

import java.util.ArrayList;

public class ReplacesecondElementWithSpecifiedElement {

	public static void main(String[] args) {
		
		ArrayList<String> color=new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		
		System.out.println("Original color list: "+color);
		
		String new_color="White";
		color.set(1, new_color);
		int n=color.size();
		System.out.println("Replacing second element with the white color:");
		
		for(int i=0;i<n;i++) {
			System.out.println(color.get(i));
		}

	}

}
