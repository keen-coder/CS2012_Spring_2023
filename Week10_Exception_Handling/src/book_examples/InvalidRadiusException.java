package book_examples;

//Extended Exception makes this a checked exception
public class InvalidRadiusException extends Exception {
	private double radius;

	/** Construct an exception */
	public InvalidRadiusException(String msg, double radius) {
		super(msg);
		this.radius = radius;
	}

	/** Return the radius */
	public double getRadius() {
		return radius;
	}
}
