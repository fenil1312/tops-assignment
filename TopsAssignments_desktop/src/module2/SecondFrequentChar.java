package module2;

public class SecondFrequentChar {

	public static void main(String[] args) {

		String str = "successes";
		System.out.println(str.substring(0,1)+str.substring(1+1));

		for (int i = 0; i < str.length(); i++) {
			int j = i + 1;

			if (str.charAt(i) == str.charAt(j)) {
				System.out.println("The second most frequent char in the string is : " + str.charAt(j));
				break;

			}
		}
	}

}
