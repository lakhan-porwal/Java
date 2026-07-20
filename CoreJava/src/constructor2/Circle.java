package constructor2;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle ( ) {
		
		
		
	}
	
	public Circle (int radius, String color, int borderwidth) {
		super (borderwidth, color) ;
		this.radius = radius ;
		System.out.println(this.radius );
	}

}
