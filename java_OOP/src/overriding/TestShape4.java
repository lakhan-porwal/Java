package overriding;

public class TestShape4 {
	
	public static void main(String[] args) {
		
		Shape t1 = new Triangle ();
		
		Triangle t = (Triangle) t1;
		
		t.setColor("red");
		t.setBoderWidth(2);
		t.setHight(10);
		t.setBase(5);
		
	
		System.out.println(t.getcolor());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getHight());
		System.out.println(t.getBase());
		t.area();
	}

}
