package module2;

public class StartsOfStrings {

	public static void main(String[] args) {

		String str1 = "Red is favorite color.";
		String str2 = "Orange is also my favorite color.";

		System.out.println(str1 + "\nStarts with Red? : " + str1.startsWith("Red"));
		System.out.println(str2 + "\nStarts with Red? : " + str2.startsWith("Red"));
	}

}
