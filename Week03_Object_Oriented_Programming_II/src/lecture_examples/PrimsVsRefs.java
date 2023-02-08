package lecture_examples;

import book_examples.Circle;

public class PrimsVsRefs {

	public static void main(String[] args) {
		Circle c1 = new Circle(6.7);
		Circle c2 = new Circle(10.7);

		int x = 10;
		
		
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		
	}

}
