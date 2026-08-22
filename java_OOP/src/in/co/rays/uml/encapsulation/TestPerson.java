package in.co.rays.uml.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] ags) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person ();
		p.setName("Atul");
		p.setDob(sdf.parse("2005-07-24"));
		p.setAddress("indore");
		
		
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
		System.out.println("age =>" + p.getAge(p.getDob()));
	}

}
