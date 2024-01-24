package module2;

import java.util.*;

public class CountInputString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lettersCount = 0;
		int spacesCount = 0;
		int numbersCount = 0;
		int othersCount = 0;

		System.out.print("Enter text : ");
		String text = sc.nextLine();
		char[] textChar = text.toCharArray();
		

		for (int i = 0; i < textChar.length; i++) {
			if ((textChar[i] >= 'a' && textChar[i] <= 'z') || (textChar[i] >= 'A' && textChar[i] <= 'Z')) {
				lettersCount++;
			}
			else if (textChar[i] == ' ') {
				spacesCount++;
			}
			else if(textChar[i] >= '0' && textChar[i] <= '9') {
				numbersCount++;
			}
			else {
				othersCount++;
			}
		}
		System.out.println("Number of letter characters : " + lettersCount);
		System.out.println("Number of space characters : " + spacesCount);
		System.out.println("Number of number characters : " + numbersCount);
		System.out.println("Number of other characters : " + othersCount);
	}

}
