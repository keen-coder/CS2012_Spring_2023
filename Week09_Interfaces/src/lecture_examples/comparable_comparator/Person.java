package lecture_examples.comparable_comparator;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private double gpa;
	
	public Person(String firstName, String lastName, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		String result = "Person(firstName: %s, lastName: %s, gpa: %.1f)";
		return String.format(result, this.firstName, this.lastName, this.gpa);
	}

	@Override
	public int compareTo(Person other) {
		int lastNameResult = this.lastName.compareTo(other.lastName);
		
		if (lastNameResult == 0) {
			int firstNameResult = this.firstName.compareTo(other.firstName);
			
			if(firstNameResult == 0) {
				return (int)((this.gpa - other.gpa) * 10);
			}
			else {
				return firstNameResult;
			}	
		}
		else {
			return lastNameResult;
		}
			
			
			
			
			
		
//		if ( == 0) {
//			return this.firstName.compareTo(other.firstName);
//		}
//		else {
//			return this.lastName.compareTo(other.lastName);
//		}
	}
	
	
	
	
	
}
