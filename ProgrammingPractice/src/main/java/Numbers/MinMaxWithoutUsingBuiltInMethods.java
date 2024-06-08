package Numbers;

public class MinMaxWithoutUsingBuiltInMethods {

	public static void main(String[] args) {
		
		int[] numbers = {14, 45, 12, 36, 47, 58, 65, 78};

		int min=numbers[0];
		int max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
				
			}
			else if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		
		    System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);

	}

}
