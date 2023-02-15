package lecture_examples;

public class Test {

	public static void main(String[] args) {
		
		String s = "6787656765";
		
		long x = Long.parseLong(s);
		
		
		System.out.println("Max Value: " + Integer.MAX_VALUE);
		System.out.println("Min Value: " + Integer.MIN_VALUE);
		System.out.println("Max Value: " + Long.MAX_VALUE);
		System.out.println("Min Value: " + Long.MIN_VALUE);
		System.out.println("Max Value: " + (int)Character.MAX_VALUE);
		System.out.println("Min Value: " + (int)Character.MIN_VALUE);
		
		
		myMethod(67654567656765L, 3.14);
		
		

	}
	
	public static void myMethod(Long l, Double d) {
		
	}

}
