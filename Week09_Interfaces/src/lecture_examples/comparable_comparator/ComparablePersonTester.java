package lecture_examples.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablePersonTester {

	public static void main(String[] args) {
		Person p1 = new Person("John", "Smith", 3.7);
		Person p2 = new Person("Emily", "Thorenson", 4.0);
		Person p3 = new Person("Becky", "Thorenson", 3.8);
		Person p4 = new Person("Adam", "Penfield", 3.5);
		Person p5 = new Person("Samantha", "Levine", 3.5);
		Person p6 = new Person("Adam", "Penfield", 3.2);
		

		ArrayList<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println();
		Collections.sort(people);
		
		for(Person p : people) {
			System.out.println(p);
		}

	}

}
