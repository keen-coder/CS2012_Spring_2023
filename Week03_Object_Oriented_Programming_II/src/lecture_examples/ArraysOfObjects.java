package lecture_examples;

import java.util.Random;

import book_examples.Circle;

public class ArraysOfObjects {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		
		
		c1.getRadius();
		c2.getRadius();
		
		
		
		
		
//		Circle[] circles = defaultCircles();
//		
//		printAreas(circles);
		
//	  //for (int i = 0 ; i < circles.length ; i++)
//		for(Circle c : circles) { 
//			System.out.println(c);
//		}

		Circle[] circles = randomCircles(100, 10, 30);
		
		for(Circle c : circles) {
			System.out.println(c.getRadius());
		}
	
	}
	
	public static void printAreas(Circle[] circles) {
		for(int i = 0 ; i < circles.length ; i++) {
			System.out.println(circles[i].area());
		}
		
//		for(Circle c : circles) {
//			System.out.println(c.area());
//		}
	}
	
	public static Circle[] randomCircles(int numCircles, 
			double startRad, double endRad) {
		
		Circle[] circles = new Circle[numCircles];
		
		for (int i = 0 ; i < circles.length ; i++) {
			Random r = new Random();
			//r.nextInt(max - min + 1) + min
			//(int)((Math.random() * (max - min + 1)) + min)
			
			double randRadius = r.nextDouble(endRad - startRad + 1) + startRad;
			circles[i] = new Circle(randRadius);
			
		}
		return circles;
	}
	
	public static Circle[] defaultCircles() {
		Circle[] circles = new Circle[5];
		circles[0] = new Circle(5.6);
		circles[1] = new Circle(100.4);
		circles[2] = new Circle(26.4);
		circles[3] = new Circle(93.25);
		circles[4] = new Circle(82.1);
		
		return circles;
		
	}

}











