package in.co.rays.list;

import java.util.Vector;

public class TestVector {
	
	public static void main(String [] args) {
		
		Vector v =  new Vector();
		
		v.addElement("Atul");
		v.addElement(7);
		
		System.out.println(v.elementAt(0));
		System.out.println(v.get(1));
		
	}

}
