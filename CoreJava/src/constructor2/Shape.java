package constructor2;

public class Shape {
	
	public String color;
	public int borderwidth;
	
	
    public Shape () {
 System.out.println("this is deafault Shape");
	}
	public Shape ( String color) {
		this ();
		this.color = color;
		System.out.println(this.color);
		
	}
	public Shape (int borderwidth , String color) {
	this ( color);
	this.borderwidth = borderwidth;
	System.out.println(this.borderwidth);
	}
	
	
}
