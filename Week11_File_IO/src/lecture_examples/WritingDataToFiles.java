package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingDataToFiles {

	public static void main(String[] args)  {
		File outFile = new File("src/files/random_data.txt");
		
		try {
			PrintWriter pw = new PrintWriter(outFile);
			
			pw.println(31);
			pw.print("hello world");
			
			//Don't forget to flush / close the output stream
			//or your data may not write to the file.
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
