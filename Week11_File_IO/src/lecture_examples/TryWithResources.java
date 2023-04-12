package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		
		File numberData = new File("src/files/numbers.txt");
		
		try (Scanner reader = new Scanner(numberData);) {
			
			while(reader.hasNextInt()) {
				int nextNum = reader.nextInt();
				System.out.println(nextNum);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File outFile = new File("src/files/test_auto_close.csv");
		
		try(PrintWriter pw = new PrintWriter(outFile)) {
			ArrayList<MyColor> colors = 
					ColorReader.readAllColors("colors.txt");
			
			ArrayList<VideoGame> games = VGReader.readGames("video_game_data.csv");
			
			Random rand = new Random();
			
			int i = 1;
			while(i <= 50) {
				int colorIndex = rand.nextInt(colors.size());
				int vgIndex = rand.nextInt(games.size());
				
				String title = games.get(vgIndex).getTitle();
				double price = games.get(vgIndex).getPrice();
				int players = games.get(vgIndex).getPeakPlayers();
				
				String color = colors.get(colorIndex).getColorName();
				
				String result = title + "," + color + "," + price + "," + players;
				
				pw.println(result);
				i++;
			}	
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
