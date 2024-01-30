package module2;

public class InterleavingOfStrings {

	static void printInterLeaving(String s1, int i, String s2, int j, String ans) {
		if (i == s1.length() && j == s2.length()) {
			System.out.println(ans);
		}

		// Either we will start with string 1
		if (i < s1.length()) {
			printInterLeaving(s1, i + 1, s2, j, ans + s1.charAt(i));
		}

		// Or with string 2
		if (j < s2.length()) {
			printInterLeaving(s1, i, s2, j + 1, ans + s2.charAt(j));
		}
	}

	public static void main(String[] args) {

		String s1 = "WX";
		String s2 = "YZ";

		printInterLeaving(s1, 0, s2, 0, "");
	}

}
