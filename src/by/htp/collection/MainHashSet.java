package by.htp.collection;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		
		set.add("a");
		set.add("b");
		set.add("c");
		
		for(String s: set){
			System.out.println(s);
		}
		
		
		

	}

}
