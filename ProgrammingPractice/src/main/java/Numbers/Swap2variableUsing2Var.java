package Numbers;

import java.util.Scanner;

public class Swap2variableUsing2Var {

	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swapping numbers are: ");

		System.out.println(a);
		System.out.println(b);

	}

}
