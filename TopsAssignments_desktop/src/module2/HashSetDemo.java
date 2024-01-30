package module2;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Blue");
		hs.add("Red");
		hs.add("Orange");
		hs.add("Black");
		hs.add("White");
		System.out.println(hs);

		// append the specified element to the end of a hash set
		System.out.println("\n// append the specified element to the end of a hash set");
		hs.add("Cian");
		System.out.println(hs);

		// iterate through all elements in a hash list
		System.out.println("\nIterate through all elements in a hash list : ");
		for (String s : hs) {
			System.out.println(s);
		}

		// get the number of elements in a hash set
		System.out.println("\n// get the number of elements in a hash set");
		System.out.println("Number of elements : " + hs.size());

		// convert a hash set to an array
		System.out.println("\nConvert a hash set to an array : ");
		String[] str = new String[hs.size()];
		hs.toArray(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i < str.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}

		// convert a hash set to a List/Array List
		System.out.println("\n\n// convert a hash set to a List/Array List");
		ArrayList<String> arr = new ArrayList<String>(hs);
		System.out.println(arr);

		// compare two sets and retain elements which are same on both sets
		System.out.println("\n// compare two sets and retain elements which are same on both sets");
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Blue");
		hs2.add("Gold");
		hs2.add("Orange");
		hs2.add("Maroon");
		hs2.add("Silver");
// retainAll() - retain only common elements
		hs.retainAll(hs2);
		System.out.println(hs);
	}

}
