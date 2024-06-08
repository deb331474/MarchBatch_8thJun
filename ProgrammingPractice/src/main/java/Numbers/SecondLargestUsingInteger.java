package Numbers;

public class SecondLargestUsingInteger {

	public static void main(String[] args) {
		
		
		int[] array = {14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int num:array) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
			}
			else if(num!=largest && num>secondLargest) {
				secondLargest=num;
			}
		}
		
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("There is no 2nd element in the array");
		}
		else {
			System.out.println("The 2nd element with duplicates in the array is: "+secondLargest);
		}

	}

}
