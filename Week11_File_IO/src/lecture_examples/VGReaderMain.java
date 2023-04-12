package lecture_examples;

import java.util.ArrayList;

public class VGReaderMain {

	public static void main(String[] args) {
		ArrayList<VideoGame> games = VGReader.readGames("video_game_data.csv");

		for (VideoGame vg : games) {
			System.out.println(vg);
		}
	}

}
