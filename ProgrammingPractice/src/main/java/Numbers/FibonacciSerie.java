package Numbers;

public class FibonacciSerie {

	public static void main(String[] args) {

		int n1=0,n2=1,nextTerm=0;
		
		System.out.println("Fibonacci series upto 1000: ");
		while(nextTerm<=1000) {
			System.out.println(nextTerm+" ");
			
			n1=n2;
			n2=nextTerm;
			nextTerm=n1+n2;
		}
		
	}

}
