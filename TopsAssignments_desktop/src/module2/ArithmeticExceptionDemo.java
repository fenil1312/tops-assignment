package module2;

import java.util.*;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		try {
			float div = n1 / n2;
			System.out.println(n1 + "/" + n2 + " = " + div);
		}

		catch (ArithmeticException e) {
			System.err.println(e);
//			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
	}

}
