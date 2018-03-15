package by.htp.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();
		Set<Person> set2 = new TreeSet<Person>(new PersonAgeComparatorASC());
		
		Set<Person> set3 = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getAge() - o2.getAge();
			}
			
		});

		set.add("d");
		set.add("a");
		set.add("z");
		set.add("k");
		set.add("da");
		set.add("q");

		set2.add(new Person(23));
		set2.add(new Person(35));
		set2.add(new Person(14));
		
		set3.add(new Person(23));
		set3.add(new Person(35));
		//set3.add("44");
		set3.add(new Person(14));

		for (Person p : set3) {
			System.out.println(p.getAge());
		}
	}
}

class PersonAgeComparatorASC implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Person p = (Person) o1;
		Person p2 = (Person) o2;
		return p.getAge() - p2.getAge();
	}
	
}

class Person /*implements Comparable */{
	private int age;

	public Person(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person) o;
//		/*if (this.age > p.getAge()) {
//			return -1;
//		} else if (this.age < p.getAge()) {
//			return 1;
//		} else {
//			return 0;
//		}*/
//		return p.getAge() - this.age;
//	}
}
