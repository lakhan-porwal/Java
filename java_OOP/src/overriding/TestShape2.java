package overriding;

public class TestShape2 {
	public static void main(String[] args) {
		
				Shape c1 = new Circle();

				//type cast shapes1 to circle c
				
				Circle c = (Circle) c1;
				c.setColor("red");
				c.setBoderWidth(2);
				c.setRadius(2);

				System.out.println("color: " + c.getcolor());
				System.out.println("borderwidth: " + c.getBorderWidth());
				System.out.println("radius: " + c.getRadius());
				c.area();
				
				Shape s2 = new Triangle();
				
				Triangle t = (Triangle) s2;


}
}