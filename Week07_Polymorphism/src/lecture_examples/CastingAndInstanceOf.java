package lecture_examples;


import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class CastingAndInstanceOf {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle("blue", true, 5.6));
		shapes.add(new Rectangle("red", false, 5, 8));
		shapes.add(new Rectangle("orange", true, 10, 5));
		shapes.add(new Circle("yellow", false, 10.74));
		
		printRadius(shapes);
	}
	
	public static void printRadius(ArrayList<Shape> list) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			Shape next = list.get(i);
			
			if (next instanceof Circle) {
				Circle cNext = (Circle)next;
				System.out.println(cNext.getRadius());
			}
			
		}
		
	}
	
	
	
}
