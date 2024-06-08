package Numbers;

public class MinMaxExample {

	public static void main(String[] args) {
		
		int[] numbers = {14, 45, 12, 36, 47, 58, 65, 78};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int n:numbers) {
			
			if(n<min) {
				min=n;
			}
			if(n>max) {
				max=n;
			}
		}
		
		System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

	}

}
