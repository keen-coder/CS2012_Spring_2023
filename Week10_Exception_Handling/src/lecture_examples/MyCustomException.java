package lecture_examples;

//extends Exception for checked exceptions.
//extends RuntimeException for unchecked exceptions.
public class MyCustomException extends Exception {
	private int x;
	
	public MyCustomException(String msg) {
		super(msg);
	}
	
	public MyCustomException(String msg, int x) {
		super(msg);
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	
}
