package by.htp.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainAppQuee {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>();
		queue.add("b");
		queue.add("z");
		queue.add("a");
		queue.add("q");
		queue.add("d");

		queue.offer("a");

		for (String s : queue) {
			System.out.println(s);
		}

		Iterator<String> qit = queue.iterator();
		while (qit.hasNext()) {
			System.out.println(qit.next());
		}

		String s = queue.poll();
		System.out.println("s: " + s + " size " + queue.size());

		s = queue.peek();
		System.out.println("s: " + s + " size " + queue.size());

		for (String s1 : queue) {
			System.out.println(s1);
		}
	}

}
