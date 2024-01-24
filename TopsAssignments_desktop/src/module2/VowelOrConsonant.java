package module2;

import java.util.*;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		String letter = sc.next();

		if (letter.length() == 1 && Character.isAlphabetic(letter.charAt(0))) {
			char ch = Character.toLowerCase(letter.charAt(0));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		} else {
			System.out.println("Error");
		}

		
//		letter = letter.toLowerCase();
//		if (Character.isAlphabetic(letter.charAt(0)) && letter.length() == 1) {
//			switch (letter) {
//			case "a":
//				System.out.println("Vowel");
//				break;
//			case "e":
//				System.out.println("Vowel");
//				break;
//			case "i":
//				System.out.println("Vowel");
//				break;
//			case "o":
//				System.out.println("Vowel");
//				break;
//			case "u":
//				System.out.println("Vowel");
//				break;
//			default:
//				System.out.println("Consonant");
//			}
//		} else {
//			System.out.println("Error");
//		}
	}

}
