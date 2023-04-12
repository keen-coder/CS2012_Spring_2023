package lecture_examples;

import java.util.ArrayList;

public class ColorReaderMain {

	public static void main(String[] args) {
		
		ArrayList<MyColor> colors = 
				ColorReader.readAllColors("colors.txt");
		
		for (MyColor mc : colors) {
			System.out.println(mc);
		}

	}

}
