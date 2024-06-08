package in.debasish.basicOperations;

import java.util.Scanner;

public class ArmstrongNumbersInRange {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the start index: ");
        int start = s.nextInt();

        System.out.print("Enter the last index: ");
        int end = s.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int originalNum = i;
            int sum = 0, n = 0;
            int temp = i;

            while (temp != 0) {
                temp /= 10;
                n++;
            }

            
            temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
        System.out.println();
    }
}