package overriding;

public class TestShape3 {
	
	public static void main(String[] args) {
		
		Shape r1 = new Rectangle ();
		
		Rectangle r = (Rectangle ) r1;
		r.setColor("red");
		r.setBoderWidth(2);
		r.setLenght(10);
		r.setWidht(5);
		
		System.out.println(r.getcolor());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getLenght());
		System.out.println(r.getWidht());
		r.area();
			
			
		}
	}


