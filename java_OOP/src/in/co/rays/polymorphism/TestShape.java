package in.co.rays.polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		
		System.out.println("length of shape array :-" + s.length);
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle ();
		
		
		Circle c = (Circle) s[0];
		c.setRadius(5);
		
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(3);
		r.setWidth(2);
		
		
		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(10);
		
		double totalArea = calcArea(s);
	    System.out.println(totalArea);
	    }
        private static double calcArea(Shape[] s) {
        	double totalArea = 0.0;
        	for (int i = 0; i < s.length; i++) {
        		System.out.println(s[i].area());
        		totalArea = totalArea + s[i].area();
        	} return totalArea;
        }
	
	}


