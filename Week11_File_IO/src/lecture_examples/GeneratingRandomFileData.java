package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GeneratingRandomFileData {
	public static void main(String[] args) {
		randomIntegers("numbers.txt", 25, 100, 1000);
	}
	
	public static void randomIntegers(String fileName, 
			int min, int max, int n) {
		
		File outFile = new File("src/files/" + fileName);
		Random rand = new Random();
		
		try {
			PrintWriter pw = new PrintWriter(outFile);
			
			for(int i = 1 ; i <= n ; i++) {
				int nextInt = rand.nextInt((max - min) + 1) + min;
				
				pw.print(nextInt + " ");
				
				if (i % 15 == 0) {
					pw.println();
				}
			}
			System.out.println("Data written successfully");
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
		
		
		
		
	}
}
