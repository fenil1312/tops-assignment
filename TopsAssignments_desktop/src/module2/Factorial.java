package module2;

import java.util.Scanner;

public class Factorial {

	static int facto(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int n = sc.nextInt();

		System.out.println("Factorial of " + n + " is " + facto(n));
	}

}
