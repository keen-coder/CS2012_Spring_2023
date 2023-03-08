package lecture_examples;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class PolymorphismTester {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle("blue", true, 5.6));
		shapes.add(new Rectangle("red", false, 5, 8));
		shapes.add(new Rectangle("orange", true, 10, 5));
		shapes.add(new Circle("yellow", false, 10.74));
		
		//printShapeColors(shapes);
		printAreas(shapes);
		

	}
	
	public static void printAreas(ArrayList<Shape> list) {
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
	}
	
	public static void printShapeColors(ArrayList<Shape> list) {
		
		for(Shape shape : list) {
			System.out.println(shape.getColor());
		}
		
		
	}
}
