package Numbers;

import java.util.Scanner;

public class SwaptwoNumbersUsing3rdVariable {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println("Swapping numbers are: ");

		System.out.println(a);
		System.out.println(b);
	}

}
