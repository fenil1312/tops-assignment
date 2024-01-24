package module2;

import java.util.*;

public class SumAndAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float average;

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter " + (i + 1) + " number : ");
			int num = sc.nextInt();
			sum += num;
		}
		average = (float)sum / 5;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

	}

}
