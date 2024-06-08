package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermdiateOperations6Limit {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,3,5,3,3,2,2,1);

		List<Integer> numbers=num.stream().limit(5).collect(Collectors.toList());
		
		System.out.println(numbers);
	}

}
