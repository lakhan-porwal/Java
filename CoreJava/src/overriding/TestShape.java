package overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		
		Circle c = new Circle () ;
		
		c.setColor("red");
		c.setBoderWidth(30);
		c.setRadius(15);
		
		c.area();
		System.out.println(c.getcolor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
			
			
		
	}

}
