package StringAndCharArray;

import java.util.Scanner;

public class FindallSubstrings {

	public static void main(String[] args) {

		String str, sub;
		int i, c, length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to get all its substrings: ");
		str = sc.nextLine();
		length = str.length();
		System.out.println("Substring of" + str + "are : ");

		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = str.substring(c, c + i);
				System.out.println(sub);
			}
		}

	}

}
