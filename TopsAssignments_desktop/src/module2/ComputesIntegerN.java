package module2;

import java.util.*;

public class ComputesIntegerN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a single digit number : ");
		int n = sc.nextInt();

		if (n < 10) {
			int nn = n * 10 + n;
			int nnn = nn * 10 + n;
			int sum = n + nn + nnn;
			System.out.println("Sum of " + n + "+" + nn + "+" + nnn + " = " + sum);
		}
		else {
			System.out.println("Please enter single digit number (0-9)...");
		}
	}

}
