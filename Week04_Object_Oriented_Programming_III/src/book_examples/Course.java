package book_examples;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		String[] copy = new String[100];
		
		int i = 0, j = 0;
		while(i < this.students.length) {
			String currStudent = this.students[i];
			
			if (!currStudent.equals(student)) {
				copy[j] = currStudent;
				j++;
			}
			
			i++;	
		}
		
			
			

		
		
		// Left as an exercise in Programming Exercise 10.9
	}
	
	
	
	
	
	
}