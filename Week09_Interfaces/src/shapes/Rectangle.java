package shapes;

public class Rectangle 
    extends Shape {
	
	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, boolean filled,
			double width, double height) {
		
		super(color, filled);

		this.width = width;
		this.height = height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return area */
	@Override
	public double area() {
		System.out.print("Rectangle Area: ");
		return this.width * this.height;
	}

	/** Return perimeter */
	@Override
	public double perimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		
		if ( !(other instanceof Rectangle) ) {
			return false;
		}
		
		Rectangle temp = (Rectangle)other;
		
		boolean superDataFieldsSame = super.equals(other);
		boolean isWidthSame = this.width == temp.width;
		boolean isHeightSame = this.height == temp.height;
		
		return superDataFieldsSame && isWidthSame && isHeightSame;
	}

	@Override
	public String toString() {
		String result = super.toString() + "\n" + 
				"width:\t" + this.width + "\n" +
				"height:\t" + this.height;
		
		return result;
	}
}