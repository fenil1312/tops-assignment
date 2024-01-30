package module2;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		// associate the specified value with the specified key in a Hash Map
		System.out.println("// associate the specified value with the specified key in a Hash Map");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Blue",111);
		hm.put("Red",222);
		hm.put("Orange",333);
		hm.put("Black",222);
		hm.put("White",444);
		System.out.println(hm);
		
		// count the number of key-value (size) mappings in a map
		System.out.println("\n// count the number of key-value (size) mappings in a map");
		System.out.println("Number of key-value : " + hm.size());
		
		// check whether a map contains key-value mappings (empty) or not
		System.out.println("\n// check whether a map contains key-value mappings (empty) or not");
		System.out.println("key-value mappings are empty ? : " + hm.isEmpty());
		
		// get a collection view of the values contained in this map
		System.out.println("\n// get a collection view of the values contained in this map");
		System.out.println("Collection view of the values :\n" + hm.values());
	}

}
