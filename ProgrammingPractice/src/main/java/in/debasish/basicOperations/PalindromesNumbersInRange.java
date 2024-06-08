package in.debasish.basicOperations;

import java.util.Scanner;

public class PalindromesNumbersInRange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        System.out.print("Enter the start index: ");
        int start = s.nextInt();

        System.out.print("Enter the last index: ");
        int end = s.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int originalNum = i;
            int reversedNum = 0;
            int temp = i;

           
            while (temp != 0) {
                int digit = temp % 10;
                reversedNum = reversedNum * 10 + digit;
                temp /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.print(originalNum + " ");
            }
        }
        System.out.println();
	}

}
