package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermerdiateOperationFilter2 {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("Alice","Bob","Charlie","David","Emma");
		
		List<String> result=names.stream().filter(name->name.length()>4).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> result1=names.stream().filter(name->name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result1);
		
		List<String> result3=names.stream().filter(name->name.endsWith("e")).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(result3);
		
	}

}
