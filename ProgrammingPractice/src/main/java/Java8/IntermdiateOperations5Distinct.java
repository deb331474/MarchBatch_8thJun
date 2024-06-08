package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermdiateOperations5Distinct {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,7,2,1,3,3);
		List<Integer> distinctNumbers=numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctNumbers);
		
		
	}

}
