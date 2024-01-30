package module2;

public class DivisibleNumber {

	public static void main(String[] args) {

		System.out.println("Numbers divisible by 3 :");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i);
				if (i < 99) {
					System.out.print(", ");
				}
				else {
					System.out.print(". ");
				}
			}

		}
		System.out.println();

		System.out.println("Numbers divisible by 5 :");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i);
				if (i < 95) {
					System.out.print(", ");
				}
				else {
					System.out.print(". ");
				}
			}
		}

		System.out.println();
		System.out.println("Numbers divisible by 3 & 5 :");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i);
				if (i < 90) {
					System.out.print(", ");
				}
				else {
					System.out.print(". ");
				}
			}
		}

	}

}
