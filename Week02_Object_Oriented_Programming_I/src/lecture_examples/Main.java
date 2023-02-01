package lecture_examples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		Person person2 = new Person("John", "Smith", 
				42, 5635465564L);
		
		Person person3 = new Person("Sue", "Smith", 
				23, 3675434567L);
		
		person1.printPerson();
		System.out.println();
		
		person2.printPerson();
		System.out.println();
		
		person3.printPerson();
		System.out.println();
		
		person2.changeLastName("Anderson");
		
		person1.printPerson();
		System.out.println();
		
		person2.printPerson();
		System.out.println();
		
		person3.printPerson();
		System.out.println();
		
		person3.hadABirthday();
		
		person3.printPerson();
		System.out.println();
		
		
	}

}
