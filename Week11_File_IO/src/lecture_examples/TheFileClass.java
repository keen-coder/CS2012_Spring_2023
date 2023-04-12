package lecture_examples;

import java.io.File;

public class TheFileClass {

	public static void main(String[] args) {
		File myFile = new File("src/files/colors.txt");
		
		System.out.println(myFile.exists());
		System.out.println(myFile.getName());
		System.out.println(myFile.getParent());
		System.out.println(myFile.getAbsolutePath());
	}

}
