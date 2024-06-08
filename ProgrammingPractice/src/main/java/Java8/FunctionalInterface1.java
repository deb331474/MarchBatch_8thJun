package Java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface1 {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(12,34,2,34,43,54,78,90);
		
		Predicate<? super Integer> isEvenPredicate = x->x%2==0;
		Function<? super Integer, ? extends Integer> squaredFunction = x->x*x;
		Consumer<Integer> sysoutConsumer = System.out::println;
		numbers.stream().filter(isEvenPredicate).map(squaredFunction).forEach(sysoutConsumer);
		System.out.println();

	}

}
