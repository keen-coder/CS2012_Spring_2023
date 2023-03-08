package lecture_examples;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Casting {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("blue", true, 5.4));
		shapes.add(new Rectangle("black", true, 5.6, 4.5));
		shapes.add(new Circle("green", false, 21.64));
		shapes.add(new Rectangle("orange", false, 6.7, 34.24));
	
		for (int i = 0 ; i < shapes.size(); i++) {
			Shape nextShape = shapes.get(i);
			
			if (nextShape instanceof Circle) {
				Circle temp = (Circle)nextShape;
				System.out.println("This is a circle.");
				System.out.println(temp.getRadius());
			}
			else if (nextShape instanceof Rectangle) {
				Rectangle temp = (Rectangle)nextShape;
				System.out.println("This is a rectangle.");
				System.out.println(temp.getWidth());
				System.out.println(temp.getHeight());
			}
			
			
		}
		
		
		
		
		
		
		
		

	}

}
