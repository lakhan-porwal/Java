package in.co.rays.constructor;

public class Shape {
	
	public String color;
	public int borderWidth;
	
	
	public Shape () {
		System.out.println("this is default in.co.rays.constructor Shape");
	}
	
	
	
	public Shape (int borderWidth , String color) {
		this.color = color;
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
		System.out.println(this.color);
		
	}
}
