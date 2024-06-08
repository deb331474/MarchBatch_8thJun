package in.debasish.arraysClass;

import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {

		int[] numbers= {5,2,8,1,6};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers1 = {1, 2, 5, 6, 8};
		int index = Arrays.binarySearch(numbers1, 5);
		System.out.println(index);
		
		
		int[] numbers2 = new int[5];
		Arrays.fill(numbers2, 41);
		System.out.println(Arrays.toString(numbers2));
		
		int[] source = {1, 2, 3, 4, 5};
		int[] destination = Arrays.copyOf(source, 6);
		
		System.out.println(Arrays.toString(destination));
		
		
		

		
		
		

		
	}

}
