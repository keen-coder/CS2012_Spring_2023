package lecture_examples;

import book_examples.Circle;

public class CopyingReferences {

	public static void main(String[] args) {
		Circle c1 = new Circle(7);
		Circle c2 = c1;
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		
		c2.setRadius(42);
		
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		
		m(c1);
		
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	}
	
	public static void m(Circle c) {
		c.setRadius(100);
	}

}
