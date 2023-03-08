package lecture_examples;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class DynamicBindingExample {
	public static void main(String[] args) {
		
	  //declared type      actual type
		Shape shape1   =   new Circle("red", true, 8.4);
		Shape shape2;
		Circle c2 = new Circle();
		
		shape2 = c2;
		
		System.out.println(c2);
		System.out.println(shape2);
		
		
		//System.out.println(shape1.area());
		
//		Shape shape2 = new Rectangle();
//		
//		Circle c1 = shape2;
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("blue", true, 5.4));
		shapes.add(new Rectangle("black", true, 5.6, 4.5));
		shapes.add(new Circle("green", false, 21.64));
		shapes.add(new Rectangle("orange", false, 6.7, 34.24));
		printAreas(shapes);
	}
	
	public static void printAreas(ArrayList<Shape> shapes) {
		
		for (Shape s : shapes) {
			System.out.println(s.getRadius());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}