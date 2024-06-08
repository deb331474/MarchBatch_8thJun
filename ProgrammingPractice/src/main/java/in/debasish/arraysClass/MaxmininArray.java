package in.debasish.arraysClass;

public class MaxmininArray {

	public static void main(String[] args) {

		int a[] = {-12, 45, -23, 64,98, -100, 24};

        // Initializing max and min with the first element of the array
        int max = a[0];
        int min = a[0];

        // Finding the maximum and minimum values
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("The Maximum number is: " + max);
        System.out.println("The Minimum number is: " + min);
	}

}
