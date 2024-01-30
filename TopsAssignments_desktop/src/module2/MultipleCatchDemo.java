package module2;

import java.util.*;

public class MultipleCatchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);

			float res = n1 / n2;
			System.out.println("Result : " + res);
		}

		catch (ArithmeticException e) {
			System.err.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		catch (NumberFormatException e) {
			System.err.println(e);
		}
		
		catch (Exception e) {
			System.err.println(e);
		}
	}

}
