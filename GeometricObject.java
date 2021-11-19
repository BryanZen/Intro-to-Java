
public abstract class GeometricObject implements Comparable, Cloneable {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	private static double radius, side1, side2;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public static double getRadius() {
		return radius;
	}
	public static double getSide1() {
		return side1;
	}
	public static double getSide2() {
		return side2;
	}
	public String getColor() { 
		return color; 
	}
	public void setColor(String color) { 
		this.color = color; 
	}
	public boolean isFilled() { 
		return filled; 
	}
	public void setFilled(boolean filled) { 
		this.filled = filled; 
	}
	public java.util.Date getDateCreated() { 
		return dateCreated; 
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public int compareTo(GeometricObject o) {
		if (o instanceof GeometricObject) {
			GeometricObject c = (GeometricObject) o;
			 if (GeometricObject.max() == c.max()) {
		            return 0;
		        } else if (GeometricObject.max() > c.max()) {
		            return 1;
		        } else {
		            return -1;
		        }
		}
    }
	public static double max() {
		double area = 0;
		if (getRadius() == 0)
			area = getSide1() * getSide2();
		if (getSide1() == 0 && getSide2() == 0)
			area = Math.pow(getRadius(), 2) * Math.PI;
		return area;
	}
}
