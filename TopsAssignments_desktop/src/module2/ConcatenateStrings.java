package module2;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String 1 : ");
		String str1 = sc.nextLine() + " ";
		System.out.print("Enter String 2 : ");
		String str2 = sc.nextLine();

		System.out.println(str1.concat(str2));
	}

}
