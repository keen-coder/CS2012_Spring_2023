package lecture_examples;

//1. Define the class header.
public class Person {
	//2. Define the data fields.
		private String firstName;
		private String lastName;
		private int age;
		private long cin;
	
	//3. Define all constructors.
	//	Constructors ARE special methods with 3 properties:
	//		1. Name of the constructor must match the 
	//		class name exactly
	//      2. Constructors do not have a return type,
	//		not even void.
	//      3. Constructors are always invoked (called)
	//      using the 'new' keyword.
	public Person() { //default constructor
		this.firstName = "FIRST_NAME";
		this.lastName = "LAST_NAME";
		this.age = 9999;
		this.cin = 123456789L;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 9999;
		this.cin = 123456789L;
	}
	
	public Person(String firstName, String lastName, 
			int age, long cin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.cin = cin;
	}
	
	//4. Define any other methods necessary for the class.
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public void changeLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void hadABirthday() {
		this.age += 1;
	}
	
	public void printPerson() {
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("CIN: " + this.cin);
	}
	
	
	
	
	
	
	
}