package module2;

import java.util.*;

public class ASCIIValues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a single character : ");

		char ch = sc.next().charAt(0);

		System.out.println("ASCII value for '" + ch + "' is : " + (int) ch);

	}

}
