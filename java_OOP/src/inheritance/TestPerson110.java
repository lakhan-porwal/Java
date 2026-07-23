package inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson110 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd") ;
		
		Person110 A = new Person110 ();
		A.setName("Lakhan Porwal");
		A.setAddress("Jaora");
        A.setDateOfBirth(sdf.parse("2007-11-15"));		
		
		System.out.println(A.getName());
		System.out.println(A.getAddress());
		System.out.println(sdf.format(A.getDateOfBirth()));
	}

}
