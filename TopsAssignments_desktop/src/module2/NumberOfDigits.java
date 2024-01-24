package module2;

import java.util.*;

public class NumberOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter number less than 10 billion(10,00,000) : ");
		int num = sc.nextInt();

		if (num < 1000000) {

			while (num > 0) {
				int modNum = num % 10;
				num /= 10;
				count++;
			}
			System.out.println("Number of digits in the numbers : " + count);
		}
		else {
			System.out.println("Please enter number less thsn 10 billion(10,00,000)...");
		}

	}

}
