package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
		
		List<Integer> distinctelements=numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctelements);
		
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3,4,5,6);
		
		List<Integer> squaredNumbers=numbers1.stream().peek(n->System.out.println("Processing "+n)).map(n->n*n).toList();
		System.out.println(squaredNumbers);
		
		
		

	}

}
