package module2;

import java.util.*;

public class GreatestOutOfThreeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Enter 1st number : ");
		num1 = sc.nextInt();

		System.out.print("Enter 2nd number : ");
		num2 = sc.nextInt();

		System.out.print("Enter 3rd number : ");
		num3 = sc.nextInt();

		// Using nested if..else
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("1st number " + num1 + " is greatest");
			} 
			else {
				System.out.println("3rd number " + num3 + " is greatest");
			}
		} 
		else if (num2 > num3) {
			System.out.println("2nd number " + num2 + " is greatest");
		} 
		else {
			System.out.println("3rd number " + num3 + " is greatest");
		}

		// Using ternary operators
		int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println(greatest + " is a greatest number");
	}

}
