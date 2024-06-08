package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermdiateOperations3FlatMapping {

	public static void main(String[] args) {

		List<String> phrases=Arrays.asList("Deba sish","Ku mar","Pr useth","R am","S hiv");
		
		List<String> distinctWords=phrases.stream().flatMap(
				(phrse->Arrays.stream(phrse.split(" "))))
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(distinctWords);
		
	}

}
