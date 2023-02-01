package lecture_examples;

public class CopyingPrimitives {

	public static void main(String[] args) {
		int x = 10;
		int y = x;
		
		x = 30;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(y);
		m(y);
		System.out.println(y);
	}
	
	public static void m(int a) {
		a = 50;
	}

}
