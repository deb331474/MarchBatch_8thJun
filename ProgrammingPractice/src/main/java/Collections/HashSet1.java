package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class HashSet1 {

	public static void main(String[] args) {

		Set<String> names=new HashSet<String>();
		names.add("Debasish");
		names.add("Kumar");
		names.add("Pruseth");
		names.add("Bob");
		System.out.println(names);
		
		names.forEach(name->System.out.println("Hello :"+name));
		
		//using method reference 
		names.forEach(System.out::println);
		
		//using for each to maintain order
		names.forEach(nam->System.out.println("Length of"+":"+nam.length()));
		
		//using for each on a stream
		Stream<String> namesStream=names.stream();
		namesStream.forEach(System.out::println);
		
	}

}
