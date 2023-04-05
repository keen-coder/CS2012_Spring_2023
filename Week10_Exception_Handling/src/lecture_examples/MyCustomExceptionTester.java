
package lecture_examples;

public class MyCustomExceptionTester {
	public static void main(String[] args) {
		int x = -1;
		
		try {
			method1(x);
		}
		catch (MyCustomException ex) {
			System.out.println(ex.getMessage());
			System.out.println("bad x value = " + ex.getX());
		}
		System.out.println("PROGRAM RECOVERS AND CONTINUES.");
	}
	
	
	public static int method1(int x) throws MyCustomException {
		if (x < 0) {
			throw new MyCustomException("x is negative", x);
		}
		
		return x;
	}
}
