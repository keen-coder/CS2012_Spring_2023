package shapes;

public class Circle 
	extends Shape implements Comparable<Circle> {
	
	private double radius;

	public Circle() {
		super();
		super.color = "red";
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this("blue", true, radius);
//		super("blue", true);
//		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, 
			double radius) {
		
		super(color, filled);
		this.radius = radius;		
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	@Override
	public double area() {
		System.out.print("Circle Area: " );
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	
	public double diameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		
		if ( !(other instanceof Circle) ) {
			return false;
		}
		
		Circle temp = (Circle)other;
		
		boolean superDataFieldsSame = super.equals(other);
		boolean isRadiusSame = this.radius == temp.radius;
		
		return superDataFieldsSame && isRadiusSame;
	}
	
	
	
	
	@Override
	public String toString() {
		String result = "color:\t" + super.getColor() + "\n";
		result += "filled:\t" + super.isFilled() + "\n";
		result += "date:\t" + super.getDateCreated() + "\n";
		
		//result += super.toString() + "\n";
		result += "radius:\t" + this.radius;
		
		return result;
	}

	//Circle c1 = new Circle(5.4);
	//Circle c2 = new Circle(10.7);
	//c1.compareTo(c2);
	@Override
	public int compareTo(Circle other) {
		if (this.radius == other.radius) {
			return 0;
		}
		else if (this.radius < other.radius) {
			return -1;
		}
		else {
			return 1;
		}
		
	}





	
	
	
	
	
	
	
	
	
	
	
	
}