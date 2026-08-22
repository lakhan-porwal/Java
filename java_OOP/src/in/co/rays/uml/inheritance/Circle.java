package in.co.rays.uml.inheritance;

public class Circle extends Shape {
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area of circle => " + (radius));
	}

}
