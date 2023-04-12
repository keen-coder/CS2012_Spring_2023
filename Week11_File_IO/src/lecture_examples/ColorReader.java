package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorReader {

	
	public static ArrayList<MyColor> readAllColors(String fileName) {
		
		File inFile = new File("src/files/" + fileName);
		ArrayList<MyColor> colors = new ArrayList<>();
		try {
			Scanner reader = new Scanner(inFile);
		
			while(reader.hasNextLine()) {
				String nextColor = reader.nextLine();
				
				MyColor color = new MyColor(nextColor);
				colors.add(color);
			}
			
			
			
	
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
		
		
		return colors;
	}
	
	
	
	
	
	
}
