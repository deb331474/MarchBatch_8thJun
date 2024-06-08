package Numbers;

public class BubbleSort1 {

	public static void main(String[] args) {

		int[] array = { 12, 87, 34, 98, 43, 25, 9, 34, 21, 22, 28, 76, 28, 25 };

		bubbleSort(array);

		for (int n : array) {
			System.out.println(" " + n);
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
