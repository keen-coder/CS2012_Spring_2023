package book_examples.comparable;

import shapes.Rectangle;

public class ComparableRectangle extends Rectangle 
    implements Comparable<ComparableRectangle> {
  /** Construct a ComparableRectangle with specified properties */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override // Implement the compareTo method defined in Comparable 
  public int compareTo(ComparableRectangle o) {
    if (super.area() > o.area())
      return 1;
    else if (super.area() < o.area())
      return -1;
    else
      return 0;
  }
  
  @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Width: " + super.getWidth() + " Height: " + super.getHeight() +
      " Area: " + super.area();
  }
}
