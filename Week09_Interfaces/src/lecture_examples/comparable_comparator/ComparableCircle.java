package lecture_examples.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

import shapes.Circle;

public class ComparableCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.5);
		Circle c2 = new Circle(5.67);
		Circle c3 = new Circle(7.45);
		Circle c4 = new Circle(23.17492);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(maxRadius(c2, c3));
		
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		circles.add(c4);
		
		for (Circle c : circles) {
			System.out.println(c.getRadius());
		}
		System.out.println();
		Collections.sort(circles);
		for (Circle c : circles) {
			System.out.println(c.getRadius());
		}

	}
	
	public static Circle maxRadius(Circle c1, Circle c2) {
		
		if (c1.compareTo(c2) > 0 ) {
			return c1;
		}
		else {
			return c2;
		}
		
		
	}
	
	

}
