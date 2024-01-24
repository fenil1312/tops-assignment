package module2;

import java.util.*;

public class LeapYearOrNot {

	static void check(int year) {
		boolean result;
		if (year % 4 == 0) {
			result = true;
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					result = true;
				} else {
					result = false;
				}
			}
		} else {
			result = false;
		}
	
		if (result == true) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = sc.nextInt();

		check(year);
	}

}
