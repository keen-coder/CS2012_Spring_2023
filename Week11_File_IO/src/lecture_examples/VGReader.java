package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VGReader {
	
	
	public static ArrayList<VideoGame> readGames(String fileName) {
		ArrayList<VideoGame> games = new ArrayList<>();
		
		File gameFile = new File("src/files/" + fileName);
		
		try {
			Scanner gameReader = new Scanner(gameFile);
			
			while(gameReader.hasNextLine()) {
				String nextLine = gameReader.nextLine();
				
				String[] tokens =  nextLine.split(",");
				
				String gameName = tokens[0];
				double gamePrice = Double.parseDouble(tokens[1]);
				int gamePlayers = Integer.parseInt(tokens[2]);
				
				VideoGame vg = new VideoGame(gameName, gamePrice, gamePlayers);
				games.add(vg);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		return games;
	}
	
	
}
