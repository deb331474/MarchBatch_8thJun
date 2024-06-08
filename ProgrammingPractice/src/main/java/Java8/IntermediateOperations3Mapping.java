package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations3Mapping {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,43,4,5,67,8,9);
		
		List<Integer> squareNumbers=numbers.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(squareNumbers);
	}

}
