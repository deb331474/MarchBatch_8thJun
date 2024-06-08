package Numbers;

public class SecondminMax1 {

	public static void main(String[] args) {
		
		int[] numbers = {14, 45, 12, 36, 47, 58, 65, 78};
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int n:numbers) {
			if(n<min1) {
				min2=min1;
				min1=n;
			} else if(n<min2 && n!=min1) {
				min2=n;
			}
			
			if(n>max1) {
				max2=max1;
				max1=n;
			}
			else if(n>max2 && n!=max1) {
				max2=n;
			}
		}
		
		System.out.println("Second Minimum: " + min2);
        System.out.println("Second Maximum: " + max2);

		
	}

}
