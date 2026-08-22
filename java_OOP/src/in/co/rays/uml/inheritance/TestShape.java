package in.co.rays.uml.inheritance;


public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("----Rectangle----");
		
		System.out.println("");
		
		Rectangle r = new Rectangle();
		
		r.setColor("red");
		r.setBorderWidth(2);
		r.setLength(3);
		r.setWidth(2);
	
		
		System.out.println("Color of Rectangle => " + r.getColor());
		
		System.out.println("");
		
		System.out.println("BorderWidth of Rectangle => " + r.getBorderWidth());
		
		System.out.println("");
		
		System.out.println("Length of Rectangle => " + r.getLength());
		
		System.out.println("");
		
		System.out.println("Width of Rectangle => " + r.getWidth());
		
		System.out.println("");
		r.area();
		
		
		System.out.println("----Circle----");
		
		System.out.println("");
		
		Circle c = new Circle();
		
		c.setColor("black");
		c.setBorderWidth(2);
		c.setRadius(1);
		
		System.out.println("Color of Circle => " + c.getColor());
		
		System.out.println("");
		
		System.out.println("BorderWidth of Circle => " + c.getBorderWidth());
		
		System.out.println("");
		
		System.out.println("Redius of Circle => " + c.getRadius());
		
		System.out.println("");
		c.area();
		
		System.out.println("----Triangle----");
		
		System.out.println("");
		
		Triangle t = new Triangle();
		
		t.setColor("Blue");
		t.setBorderWidth(3);
		t.setBase(5);
		t.setHeight(10);
		
		System.out.println("Color of Triangle => " + t.getColor());
		
		System.out.println("");
		
		System.out.println("BorderWidth of Triangle => " + t.getBorderWidth());
		
		System.out.println("");
		
		System.out.println("Base of Triangle => " + t.getBase());
		
		System.out.println("");
		
		
		System.out.println("Height of Triangle => " + t.getHeight());
		
		System.out.println("");
		t.area();
		
	}
	
}
