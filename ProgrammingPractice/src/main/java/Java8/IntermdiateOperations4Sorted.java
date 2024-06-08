package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermdiateOperations4Sorted {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Cherry");
		
		List<String> sortedFruits=fruits.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedFruits);
	}

}
