package Numbers;

import java.util.ArrayList;

public class SecondMinMaxUsingArrayList {
		    public static void main(String[] args) {
		    	int[] numbers = {14, 45, 12, 36, 47, 58, 65, 78};

		        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

		        // Initialize second min and second max
		        int secondMin = Integer.MAX_VALUE;
		        int secondMax = Integer.MIN_VALUE;

		        // Iterate through the array
		        for (int number : numbers) {
		            // If the number is not in the uniqueNumbers list, add it
		            if (!uniqueNumbers.contains(number)) {
		                uniqueNumbers.add(number);
		            }
		        }

		        // Iterate through the uniqueNumbers list
		        for (int uniqueNumber : uniqueNumbers) {
		            if (uniqueNumber < secondMin) {
		                secondMax = secondMin;
		                secondMin = uniqueNumber;
		            } else if (uniqueNumber < secondMax && uniqueNumber != secondMin) {
		                secondMax = uniqueNumber;
		            }
		        }

		        System.out.println("Second Minimum: " + secondMin);
		        System.out.println("Second Maximum: " + (secondMax == Integer.MIN_VALUE ? "N/A" : secondMax));


	}

}