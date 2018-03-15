package by.htp.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import by.htp.collection.bean.Student;
import by.htp.collection.bean.StudentAgeComparator;

public class MainApp {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Brest");
		set.add("Vitebsk");
		set.add("Grodno");
		set.add("Gomel");
		set.add("Minsk");
		set.add("Mogilev");
		set.add("Pinsk");
		set.add("Borisov");
		set.add("Skidel");
		set.add("Minsk");
		set.add("Minsk");
		set.add("Minsk");
		
		for(String s: set){
			//System.out.println(s);
		}
		
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Brest");
		linkedSet.add("Vitebsk");
		linkedSet.add("Brest");
		linkedSet.add("Grodno");
		linkedSet.add("Gomel");
		linkedSet.add("Minsk");
		linkedSet.add("Brest");
		linkedSet.add("Mogilev");
		linkedSet.add("Pinsk");
		linkedSet.add("Borisov");
		linkedSet.add("Skidel");
		
		for(String s: linkedSet){
		//	System.out.println(s);
		}
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		treeSet.add("Six");
		treeSet.add("Seven");
		treeSet.add("Two");
		
		for(String s: treeSet){
			System.out.println(s);
		}
		
		Set<Student> treeSetStudent = new TreeSet<>(new StudentAgeComparator());
		treeSetStudent.add(new Student("Vasil", "Petrov", 21));
		treeSetStudent.add(new Student("Ivan", "Smornov", 23));
		treeSetStudent.add(new Student("Vasil", "Petrov", 21));
		treeSetStudent.add(new Student("Ivan", "Smornov", 23));
		
		for(Student s: treeSetStudent){
			System.out.println(s);
		}
		
		Comparator com = null;
		Set<Student> treeSetStudent2 = new TreeSet<>(com = new Comparator<Student>(){

			@Override
			public int compare(Student st1, Student st2) {
				return st1.getName().compareTo(st2.getName());
			}
			
		});
	
	}
	
}
