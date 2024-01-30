package module2;

import java.util.Scanner;

public class GradeOfMarks {

	static void grade(int marks) {
		if (marks <= 100 && marks >= 91) {
			System.out.println("You have passed with AA grade");
		} else if (marks <= 90 && marks >= 81) {
			System.out.println("You have passed with AB grade");
		} else if (marks <= 80 && marks >= 71) {
			System.out.println("You have passed with B grade");
		} else if (marks <= 70 && marks >= 61) {
			System.out.println("You have passed with C grade");
		} else if (marks <= 60 && marks >= 51) {
			System.out.println("You have passed with D grade");
		} else if (marks <= 50 && marks >= 41) {
			System.out.println("You have passed with DD grade");
		} else {
			System.out.println("You have failed");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your marks : ");
		int marks = sc.nextInt();

		grade(marks);
	}

}
