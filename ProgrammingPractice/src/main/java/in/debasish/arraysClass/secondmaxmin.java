package in.debasish.arraysClass;

public class secondmaxmin {

	public static void main(String[] args) {

		
		  int a[] = {-12, 45, -23, 64, -100, 24};

	        // Sorting the array in descending order
	        for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                int temp = 0;
	                if (a[i] < a[j]) {
	                    temp = a[j];
	                    a[j] = a[i];
	                    a[i] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted array in descending order:");
	        for (int k = 0; k < a.length; k++) {
	            System.out.println(a[k]);
	        }

	        // Finding the second maximum and second minimum
	        if (a.length >= 2) {
	            System.out.println("The Second maximum number is: " + a[1]);
	            System.out.println("The Second minimum number is: " + a[a.length - 2]);
	        } else {
	            System.out.println("Array does not have enough elements to find second maximum and second minimum.");
	        }
	}

}
