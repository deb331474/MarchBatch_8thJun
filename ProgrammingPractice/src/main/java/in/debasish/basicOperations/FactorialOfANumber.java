package in.debasish.basicOperations;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter a number to find its factorial");
		int n=s.nextInt();
		int factorial=1;
		
		if(n==0) {
			System.out.println("Invalid Number");
		}
		else {
			for(int i=1;i<=n;i++) {
				factorial=factorial*i;
			}
			System.out.println("The factorial of the given number are:"+factorial);
		}
	}

}
