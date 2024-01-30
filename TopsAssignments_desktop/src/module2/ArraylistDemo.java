package module2;

import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {

		// create a new array list
		ArrayList<String> color = new ArrayList<String>();
		// add some colors (string)
		color.add("Blue");
		color.add("Red");
		color.add("Orange");
		color.add("Black");
		color.add("White");
		// print out the collection
		System.out.println("// print out the collection");
		System.out.println(color);

		// iterate through all elements
		System.out.println("\nIterate through all elements : ");
		for (String s : color) {
			System.out.println(s);
		}

		// insert an element into the array list at the first position
		System.out.println("\n// insert an element into the array list at the first position");
		color.add(0, "Cian");
		System.out.println(color);

		// retrieve an element (at a specified index) from a given array list
		System.out.println("\n// retrieve an element (at a specified index) from a given array list");
		System.out.println(color.get(1));

		// update specific array element by given element
		System.out.println("\n// update specific array element by given element");
		color.set(4, "Gold");
		System.out.println("\n" + color);

		// remove the third element from an array list
		System.out.println("\n// remove the third element from an array list");
		color.remove(2);
		System.out.println(color);

		// search an element in an array list
		Scanner sc = new Scanner(System.in);
		System.out.print("\nSearch element from above list : ");
//		String search = sc.next();
		String search = "Blue";
		System.out.println("\nSearch element present at index " + color.indexOf(search));

		// sort a given array list
		System.out.println("\n// sort a given array list");
		Collections.sort(color);
		System.out.println("color elements...");
		System.out.println(color);

		// copy one array list into another
		System.out.println("\n// copy one array list into another");
		ArrayList<String> newColor = new ArrayList<String>(color);
		System.out.println(newColor);

		// shuffle elements in an array list
		System.out.println("\n// shuffle elements in an array list");
		Collections.shuffle(newColor);
		System.out.println("newColor elements...");
		System.out.println(newColor);

		// reverse elements in an array list
		System.out.println("\n// reverse elements in an array list");
		System.out.println(newColor.reversed());

		// extract a portion of an array list
		System.out.println("\n// extract a portion of an array list");
		System.out.println(newColor.subList(1, 4));

		// compare two array lists
		System.out.println("\n// compare two array lists");
		System.out.println(color.equals(newColor));

		// swap two elements in an array list
		Collections.swap(newColor, 0, 3);
		System.out.println("\n0th index swapped with 3rd index in newColor...");
		System.out.println(newColor);

		// join two array lists
		color.addAll(newColor);
		System.out.println("\nJoin two array lists...\n" + color);
		
		// increase the size of an array list
		System.out.println("\n// increase the size of an array list");
		newColor.ensureCapacity(8);
		newColor.add("Silver");
		newColor.add("White");
		newColor.add("Grey");
		System.out.println("\nAfter increasing the size :\n" + newColor);
		
		// replace the second element of an Array List with the specified element
		System.out.println("\n// replace the second element of an Array List with the specified element");
		newColor.set(1,"Black");
		System.out.println(newColor);
		
		// print all the elements of an Array List using the position of the elements
		System.out.println("\n// print all the elements of an Array List using the position of the elements");
		System.out.println("Elements of newColor : ");
		for(int i = 0; i < newColor.size(); i++) {
			System.out.println(i + ". " + newColor.get(i));
		}
	}

}
