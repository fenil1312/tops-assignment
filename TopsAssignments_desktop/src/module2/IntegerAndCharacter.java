package module2;

public class IntegerAndCharacter {

	void num(int n, char c) {
		System.out.println("int = " + n + " char = " + c);
	}

	void num(int n, char c, int n1) {
		System.out.println("int = " + n + " char = " + c + " int = " + n1);
	}

	void num(char c, int n) {
		System.out.println("char = " + c + " int = " + n);
	}

	public static void main(String[] args) {

		IntegerAndCharacter ic = new IntegerAndCharacter();

		ic.num(1, 'a');
		ic.num('a', 1);
		ic.num(1, 'a', 2);
	}

}
