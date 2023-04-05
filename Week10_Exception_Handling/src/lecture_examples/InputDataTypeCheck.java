package lecture_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataTypeCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean isNotValid = true;
		int x = 0;
		
		do {
			try {
				System.out.print("Enter an int: ");
				x = in.nextInt();
				isNotValid = false;
			}
			catch(InputMismatchException ex) {
				in.nextLine();
				System.out.println("ERROR: Input is incorrect data type.");
				System.out.println("Expecting Integer.");
			}
		} while(isNotValid);
		
		
		
		System.out.println("Program Continues...");
		
		
		

	}

}
