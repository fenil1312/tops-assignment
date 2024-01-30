package module2;

public class CompareStrings {

	public static void main(String[] args) {

		String str1 = "topsint.com";
		String str2 = "topsint.com";
		String str3 = "Topsint.com";
		
		System.out.println("For equals()");
		System.out.println("topsint.com and topsint.com : " + str1.equals(str2));
		System.out.println("Topsint.com and topsint.com : " + str3.equals(str2));
		
		System.out.println();
		System.out.println("For equalsIgnoreCase()");
		System.out.println("topsint.com and topsint.com : " + str1.equalsIgnoreCase(str2));
		System.out.println("Topsint.com and topsint.com : " + str3.equalsIgnoreCase(str2));
	}

}
