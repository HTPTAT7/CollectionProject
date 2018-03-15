package by.htp.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainLinledList {

	public static void main(String[] args) {
	
		Queue<String> qList = new LinkedList<>();
		
		qList.add("a");
		qList.add("b");
		qList.add("c");
		qList.add("d");
		
		for(String s: qList){
			System.out.println(s);
		}
		
		List<String> list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String s: list){
			System.out.println(s);
		}
		
		System.out.println(list.get(3));
		list.add(2, "????");
		list.set(2, "!!!!!!");
		
		for(String s: list){
			System.out.println(s);
		}

	}

}
