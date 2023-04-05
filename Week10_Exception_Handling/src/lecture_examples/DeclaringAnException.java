package lecture_examples;

import java.io.FileNotFoundException;

public class DeclaringAnException {
	public static void main(String[] args) {
		
		try {
			methodA();
			
		}
		catch(FileNotFoundException ex) {
			
		}
		catch(IllegalArgumentException ex) {
			
		}
		
	}
	
	
	//FileNotFoundException is checked so we need 
	//to declare it in the method header.
	public static void methodA() throws FileNotFoundException {
		throw new FileNotFoundException("File missing.");
	}

	//IndexOutOfBounds is unchecked, but you should declare it anyway.
	public static void methodB() throws IndexOutOfBoundsException{
		throw new IndexOutOfBoundsException("Wrong index");
	}
}
	
	
	
