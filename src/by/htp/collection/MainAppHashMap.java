package by.htp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainAppHashMap {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		Map<Integer, ArrayList<String>> map2 = new HashMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(2, "Second");
		map.put(6, "Three");
		
		
		for(String s: map.values()){
			System.out.println(s);
		}
		
		for (Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry);
		}
	}

}
