package lecture_examples;

public class Test {
	private String x;
	
	public Test() {
		this.x = null;
	}
	
	public String toString() {
		return "x = " + ((x == null) ? null : x.toString());
	}
	
	public static void main(String[] args) {
		System.out.println(new Test());
	}
	
}
