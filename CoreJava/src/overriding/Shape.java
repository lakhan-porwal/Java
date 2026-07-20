package overriding;

public class Shape {
	
	
	protected String color;
	protected int borderWidth;
	
	
	public String getcolor () {
		return color;
		
	}
	public void setColor (String color) {
		this.color = color ;
		
	}
	public int getBorderWidth () {
		return borderWidth;
		
	}
	public void setBoderWidth ( int borderWidth) {
		this.borderWidth = borderWidth;
		
				
	}
	public void area ( ) {
		System.out.println("Area from shape class");
	}

}
