package Numbers;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78 };

		bubbleSort(array);
		
		System.out.println("The Sorted array is:");
		for(int num:array) {
			System.out.println(num+" ");
		}

	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}

	}

}
