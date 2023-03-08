package lecture_examples;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class PolymorphismExamples {

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle();

		method(new Circle());
		method(new Rectangle());
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle());
		shapes.add(new Rectangle());	
	}
	
	public static void method(Shape shape) {
		
	}
	
	public static void printColors(ArrayList<Shape> shapes) {		
		
		for (int i = 0 ; i < shapes.size(); i++)  {
			System.out.println(shapes.get(i).getColor());
		}
	}
	

}
