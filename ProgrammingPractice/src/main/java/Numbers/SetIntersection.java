package Numbers;

import java.util.Arrays;
import java.util.HashSet;

public class SetIntersection {

	public static void main(String[] args) {

		Integer[] set1 = {1, 2, 3, 4, 5};
        Integer[] set2 = {3, 4, 5, 6, 7};
        
        HashSet<Integer> intersection=new HashSet<Integer>(Arrays.asList(set1));
        
        intersection.retainAll(new HashSet<>(Arrays.asList(set2)));
        
        System.out.println("Intersection is: "+intersection);
        
        
	}

}
