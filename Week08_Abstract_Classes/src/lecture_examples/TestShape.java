package lecture_examples;

public class TestShape {
	/** Main method */
	public static void main(String[] args) {
		
		//Cannot instantiate an abstract class.
		//Shape shape = new Shape();
		
		
		// Create two shape objects
		Shape shape1 = new Circle(5);
		Shape shape2 = new Rectangle(3, 5);
		
		System.out.println("The two objects have the same area? " +
				equalArea(shape1, shape2));

		// Display circle
		displayGeometricObject(shape1);

		// Display rectangle
		displayGeometricObject(shape2);
	}

	/** A method for comparing the areas of two geometric objects */
	public static boolean equalArea(Shape object1,
			Shape object2) {
		return object1.area() == object2.area();
	}

	/** A method for displaying a geometric object */
	public static void displayGeometricObject(Shape object) {
		System.out.println();
		System.out.println("The area is " + object.area());
		System.out.println("The perimeter is " + object.perimeter());
	}
}