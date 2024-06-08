package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakingArrayListReadOnly {

	public static void main(String[] args) {
		
		List<String> sampleList=new ArrayList<>();
		
		sampleList.add("Practice");
		sampleList.add("Solve");
		sampleList.add("Interview");
		
		System.out.println("The initial list is :" +sampleList);
		
		List<String> readOnlyList=Collections.unmodifiableList(sampleList);
		
	     System.out.println("The ReadOnly ArrayList is : "
                 + readOnlyList);
	     
	     readOnlyList.add("Job");

	}

}
