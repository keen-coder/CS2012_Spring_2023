package lecture_examples;

public class ConstructorsWithThis {
	private int x;
	private double a;
	private String text;
	
	
	//ConstructorsWithThis object = ConstructorsWithThis();
	public ConstructorsWithThis() {
		this(1, 1.0, "hello World");
//		
//		this.x = 1;
//		this.a = 1.0;
//		this.text = "hello world";
	}
	
	public ConstructorsWithThis(int x) {
		this(x, 1.0, "hello world");
	}
	
	
	public ConstructorsWithThis(int x, double a, String text) {
		this.x = x;
		this.a = a;
		this.text = text;
	}
	
	
	
	
	
	
}
