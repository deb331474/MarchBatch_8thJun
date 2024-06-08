package in.debasish.basicOperations;

public class PrimeNumbersinRange {
	
	public static void main(String[] args) {
        int start = 89;
        int end = 178;
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; 
        }
        if (num % 2 == 0) {
            return false; 
        }
        
        
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true; // If no factors were found, num is prime

}
}