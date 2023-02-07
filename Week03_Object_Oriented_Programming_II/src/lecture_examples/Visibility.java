package lecture_examples;

public class Visibility {
	
	//Only available to this class.
	private int x;
	
	//Protected
	protected double a;
	
	//Public
	public char ch;
	
	//default modifier
	boolean isValid;
	
	
	public Visibility(int x, double a, char ch) {
		this.x = x;
		this.a = a;
		this.ch = ch;
		
		this.initClass();
	}
	
	private void initClass() {
		
	}
	
	
}
