package lecture_examples;

import book_examples.Circle;

public class DeepCopyObject {

	public static void main(String[] args) {
		Circle c1 = new Circle(7);
		Circle c2 = new Circle();
		
		c2.setRadius(c1.getRadius());
		

	}

}
