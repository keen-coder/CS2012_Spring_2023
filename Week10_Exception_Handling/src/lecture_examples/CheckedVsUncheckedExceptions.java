package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedVsUncheckedExceptions {

	public static void main(String[] args) {
		
		//FileNotFoundException is a checked exception.
		File inputFile = new File("mydata.txt");
		
		
		try {
			Scanner in = new Scanner(inputFile);
		}
		catch (FileNotFoundException ex) {
			
		}
		
		int[] x = new int[10];
		
		int y = x[20]; //<- Could throw an ArrayIndexOutOfBoundsException,
					   //   but we don't have to handle it if we don't want to.	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
