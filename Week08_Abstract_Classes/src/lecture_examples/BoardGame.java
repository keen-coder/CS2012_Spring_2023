package lecture_examples;

public abstract class BoardGame {
	private String title;
	
	public abstract void play();
	
	public final String getTitle() {
		return this.title;
	}
	
	
//	{
//		System.out.println("play() method in BoardGame");
//		return;
//	}
	
}
