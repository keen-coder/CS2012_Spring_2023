package lecture_examples;

import java.util.Scanner;

import book_examples.Circle;

public class PassingObjectsToMethods {

	public static void main(String[] args) {
		Circle c1 = new Circle(35.87);
		
		System.out.println(c1.getRadius());
		changeRadius(c1);
		System.out.println(c1.getRadius());
		
		
		Circle c2 = createCircle();
		
		System.out.println("Value of: " + c2);

	}
	
	public static Circle createCircle() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a radius: ");
		
		double radius = in.nextDouble();
		
		Circle c = new Circle(radius);
		
		System.out.println("Value of c: " + c);
		
		return c;
		
		
	}
	
	
	public static void changeRadius(Circle c) {
		c.setRadius(28.18);
	}
	
	public static void printArea(Circle c) {
		System.out.println(c.area());
	}

}
